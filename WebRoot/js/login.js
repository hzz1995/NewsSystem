
$(document).ready(function () {
    $('#lg_form input').keydown(function (e) {
        if (e.keyCode == 13)
        {
            checkUserName();//$('#login_submit').click();
        }
    });
    $("#login").click(checkUserName);  
});
 
function checkUserName()//登录前，校验用户信息
{    
      var a=$('#id').val();
      var b=$('#pwd').val();
      if(a==""){alert("请输入考号");return;      }
      var re=/\d{4}$|\d{8}$/;
      if(!re.test(a)){alert("考号格式错误");return;     }
      if(b==""||b==undefined){alert("请输入登录密码");return;}

      $.ajax({
            url : base+"news/docount",
            data :{"id":a,"pwd":b},
            type:"POST",
            success : function (res) {
                  if (res==1) {
                       window.location.href=base+"jsp/index.jsp";
                  }else {alert(res);             }
                  return false;
            },
            error : function(res) {alert("系统错误！");      }
      });
}