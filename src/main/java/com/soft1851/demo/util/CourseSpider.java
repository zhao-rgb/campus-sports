package com.soft1851.demo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soft1851.demo.domain.entity.SysCourse;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhao
 * @className 健身课程爬虫
 * @Description TODO
 * @Date 2020/6/19
 * @Version 1.0
 **/
public class CourseSpider {

    private static final Integer SUCCESS = 200;

    public static List<SysCourse> getCourses(){
        List<SysCourse> sysCourses = new ArrayList<>();
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.116 Safari/537.36";
        for (int i = 1; i < 9; i++){
            String url = "https://www.hiyd.com/videos/?page="+i;

        CloseableHttpClient httpClient = HttpClients.createDefault();

        try{
            Thread.sleep(4000);
            HttpGet httpget = new HttpGet(url);
            httpget.setHeader("User-Agent",userAgent);
            HttpClientContext context = HttpClientContext.create();
            CloseableHttpResponse response = httpClient.execute(httpget,context);
            System.out.println(response.getStatusLine());
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == SUCCESS){
                HttpEntity entity = response.getEntity();
                if (entity != null){
                    String res = EntityUtils.toString(entity);
                    Document document = Jsoup.parse(res);
                    Elements elements = (Elements) document.getElementsByClass("list-item");
                    for(Element element : elements){
                        Element itemPic = element.child(0);
                        //图片
                        Elements picture = itemPic.select("a img");
                        String avatar = picture.attr("src");
                        System.out.println(avatar);

                        Element itemContent = element.child(1);
                        //标题
                        String courseName = itemContent.select(" h2 a").text();
                        System.out.println(courseName);
                        //教师介绍
                        String teacherDescription = itemContent.select(" p a").text();
                        System.out.println(teacherDescription);
                        //网页
                        Elements html = itemContent.select("a");
                        String uri = html.attr("href");
                        System.out.println(uri);
                        //视频url
                        String url1 = getUrl(uri);
                        System.out.println("开始");
                        System.out.println(url1);
                        System.out.println("结束");
                        SysCourse sysCourse = SysCourse.builder().courseName(courseName)
                                .avatar(avatar)
                                .local(DataUtil.getLocal())
                                .type(DataUtil.getTypes())
                                .lessonNumber(3L)
                                .time(DataUtil.getTime())
                                .fatBurning(DataUtil.getfat())
                                .difficulty(DataUtil.getDifficulty())
                                .teacherName(DataUtil.getTeacherName())
                                .teacherDescription(teacherDescription)
                                .url(url1)
                                .build();
                        sysCourses.add(sysCourse);
                    }
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        }
        return sysCourses;
    }

    public static String getUrl(String uri){
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.116 Safari/537.36";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String url = "https:"+uri;
        System.out.println(url);
        try {
            HttpGet httpget = new HttpGet(url);
            httpget.setHeader("User-Agent",userAgent);
            HttpClientContext context = HttpClientContext.create();
            CloseableHttpResponse response = httpClient.execute(httpget,context);
            System.out.println("w2w20"+response.getStatusLine());
            int statusCode = response.getStatusLine().getStatusCode();
            if(statusCode==SUCCESS){
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String res = EntityUtils.toString(entity);
                    Document document = Jsoup.parse(res);
                    Elements scripts = document.getElementsByTag("script");
                    String wholeDate = scripts.select("script").get(3).html();
                    String data1 = wholeDate.substring(wholeDate.indexOf("data") + 6,wholeDate.indexOf("poster") - 35);
                    JSONArray jsonArray = JSONArray.parseArray(data1);
                    StringBuilder stringBuilder = new StringBuilder();
                    jsonArray.forEach(o ->{
                        JSONObject json = JSONObject.parseObject(o.toString());
                        String avatar = json.getString("url");
                        stringBuilder.append(avatar);
                    });
                    return stringBuilder.toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        for (SysCourse sysCourse : getCourses()){
            System.out.println(sysCourse);
        }
    }
}
