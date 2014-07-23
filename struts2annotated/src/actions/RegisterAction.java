package actions;

import org.apache.struts2.convention.annotation.*;  

@Action(value="myAction",results={@Result(name="success",location="/myresults/result.jsp")})  
public class RegisterAction {  
private String name;  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String execute()  
{  
return "success";      
}  
}  