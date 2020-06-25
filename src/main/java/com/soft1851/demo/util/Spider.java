package com.soft1851.demo.util;

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

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhao
 * @className Spider
 * @Description TODO
 * @Date 2020/6/23
 * @Version 1.0
 **/
public class Spider {

    private static final Integer SUCCESS = 200;

    public static List<SysCourse> getCourses(){
        List<SysCourse> sysCourses = new ArrayList<>();
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.116 Safari/537.36";
            String url = "https://www.hiyd.com/hixuetang/?page=2";

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
                                    .url("http://static.ouj.com/hiyd_cms/716b3430f2b440cea7c2ae6613b27caa.mp4")
                                    .build();
                            sysCourses.add(sysCourse);
                        }
                    }
                }

            } catch (Exception e){
                e.printStackTrace();
            }

        return sysCourses;
    }

    public static void main(String[] args) {
        for (SysCourse sysCourse : getCourses()){
            System.out.println(sysCourse);
        }
    }
}
