var bver,role="5";
$(document).ready(function () {
    $('#lg_form input').keydown(function (e) {
        if (e.keyCode == 13)
        {
            checkUserName();//$('#login_submit').click();
        }
    });
    $("input:radio[name='role']").change(function (){
      role=$("input:radio[name='role']:checked").val();
    });
    $("#login").click(checkUserName);  
});
 
function checkUserName()//登录前，校验用户信息
{    
      var a=$('#uid').val();
      var b=$('#pwd').val();
      if(a==""){alert("请输入考号");return;      }
      var re=/^\d{4}$|^\d{8}$/;
      if(!re.test(a)){alert("考号格式错误");return;     }
      if(b==""||b==undefined){alert("请输入登录密码");return;}
      $.ajax({
            url : base+"user/doLogin",
            data :{"uid":a,"pwd":b,"role":role},
            type:"POST",
            success : function (res) {
                  if (res.ok) {
                        window.location.href=base+res.msg;
                  }else {alert(res.msg);             }
                  return false;
            },
            error : function(res) {alert("系统错误！");      }
      });
}