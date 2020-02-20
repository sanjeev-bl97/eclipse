package day14;

import java.io.IOException;

public class callwrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         wrappermethod wm = new wrappermethod();
         wm.launchapp("https://in.linkedin.com/");
         wm.clickbyxpath("/html/body/nav/a[3]");
         wm.enterbyid("username","sanjeev.bl97@gmail.com");
         wm.enterbyid("password","9003510663");
         wm.clickbyxpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
	     wm.screenshot("C:\\Users\\BLTuser.BLT0206\\Desktop\\jav\\Selinium\\Screenshot\\f.png");
	}

}
