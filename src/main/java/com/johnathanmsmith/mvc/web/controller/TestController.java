package com.johnathanmsmith.mvc.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RequestMapping
RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
RequestMapping注解有六个属性，下面我们把她分成三类进行说明。
1、 value， method；
value：     指定请求的实际地址，指定的地址可以是URI Template 模式（后面将会说明）；
method：  指定请求的method类型， GET、POST、PUT、DELETE等；

2、 consumes，produces；
consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
produces:    指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；

3、 params，headers；
params： 指定request中必须包含某些参数值是，才让该方法处理。
headers： 指定request中必须包含某些指定的header值，才能让该方法处理请求。



<plugin>
    <groupId>org.mortbay.jetty</groupId>
    <artifactId>maven-jetty-plugin</artifactId>
    <version>6.1.26</version>
    <configuration>
    <reload>manual</reload>
    <stopKey>stop</stopKey>
    <stopPort>9966</stopPort>
    </configuration>
</plugin>

//mvn jetty:run
//http://localhost:8080/myRoseDemo/swagger/index.html#!//index
//http://localhost:8080/HelloWorld-MVC-Swagger/swagger/index.html#!//index
 */
@RestController
@RequestMapping("/test")
public class TestController {
    //则访问http://localhost/xxxx/departments的时候，会调用simplePattern方法了
    @RequestMapping(value="/departments")
    public String simplePattern(){
        System.out.println("simplePattern method was called");
        return "someResult";
    }

//    // departments2?departmentId=23就可以触发访问findDepatment方法了
//    @RequestMapping(value="/departments2", method = RequestMethod.GET)
//    public String findDepatment2(@RequestParam("departmentId") String departmentId){
//        System.out.println("Find department with ID: " + departmentId);
//        return "someResult2";
//    }
//
//    //形如REST风格的地址访问，比如：/departments/23，其中用(@PathVariable接收rest风格的参数
//    @RequestMapping(value="/departments3/{departmentId}", method = RequestMethod.GET, consumes="application/json")
//    public String findDepatment3(@PathVariable String departmentId){
//        System.out.println("Find department with ID: " + departmentId);
//        return "someResult3    " + departmentId;
//    }
//
//    /**
//     * 接收形如/departments/23的URL访问，把23作为传入的departmetnId,但是在实际的方法findDepatmentAlternative中，使用
//       @PathVariable("departmentId") String someDepartmentId，将其绑定为someDepartmentId,所以这里someDepartmentId为23
//      * @param someDepartmentId
//     * @return
//     */
//    @RequestMapping(value="/departments4/{departmentId}", method = RequestMethod.GET)
//    public String findDepatmentAlternative(@PathVariable("departmentId") String someDepartmentId){
//        System.out.println("Find department with ID: " + someDepartmentId);
//        return "someResult4  " + someDepartmentId;
//    }
//
//    /**
//     * url中同时绑定多个id
//     */
//    @RequestMapping(value="/departments5/{departmentId}/employees/{employeeId}", method = RequestMethod.GET)
//    public String findEmployee(@PathVariable String departmentId, @PathVariable String employeeId){
//        System.out.println("Find employee with ID: " + employeeId + " from department: " + departmentId);
//        return "someResult5   " + "Find employee with ID: " + employeeId + " from department: " + departmentId;
//
//    }
//
//    /**
//     * 支持正则表达式
//     * 比如如下的URL：/sometext.123，则输出：Textual part: sometext, numeric part: 123.
//     */
//    @RequestMapping(value="/{textualPart:[a-z-]+}.{numericPart:[\\d]+}", method = RequestMethod.GET)
//    public String regularExpression(@PathVariable String textualPart, @PathVariable String numericPart){
//        System.out.println("Textual part: " + textualPart + ", numeric part: " + numericPart);
//        return "someResult5   " + "Textual part: " + textualPart + ", numeric part: " + numericPart;
//    }
}
