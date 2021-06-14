package ClassTopic;

public class Playingwithobject {
	
	Paper s=new Paper();
	//s.setText("hello World");
	
	//System.out.println(p.getText());

}


class Printer{
	
	public void print(Paper p)
	{
		p.setText("get lost");
	}
}

class Paper{
	String text;
	public void setText(String t)
	{
		text=t;
	}
	public String getText()
	{
		return text; 
	}
}