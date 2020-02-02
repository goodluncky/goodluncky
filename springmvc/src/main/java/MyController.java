

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.lang.annotation.Annotation;

public class MyController implements Controller {

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request,
                                      javax.servlet.http.HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();

        mv.addObject("mytest","wo de ce shi");
        //逻辑视图名，根据资源解析器 拼成物理视图。
        mv.setViewName("welcome");
    /*    System.out.println("-----------------dddddddddddddddddddddd------------------------------------");
        System.out.println(request);
        System.out.println(response);*/
        return mv;
    }
}
