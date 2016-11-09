$(function() {
	var studArray = new Array();
	// Ajax验证登录
	$("#submit").click(
			function() {
				var studName = $("#studName").val();
				var studPassword = $("#studPassword").val();
				if (studName == "" || studPassword == "") {
					alert("用户名或密码不能为空");
					return false;
				}
				// jax
				$.ajax({
					data : {
						name : studName,// 向Springmvc方法发送数据
						password : studPassword,
					},
					type : "POST",// 向spingmvc发送数据的方式
					dataType : 'text',// 数据类型
					url : "showStudent.do",// 访问springmvc的路径
					// 访问成功执行的方法
					success : function(responseText) {
						window.location.href = "loginSuccess.do?studentId="
								+ responseText;// 登录成功,跳转至成功登录页面
					},
					// 访问失败执行的方法
					error : function(responseText) {
						alert("登录失败,学号或者密码输入错误,请重新输入。");
					},
				});

			});

	// 检测注册信息是否填完整
	$(":submit[name='register']").click(function() {
		var content = "";
		for (var i = 0; i < 5; i++) {
			content = $("#" + i).val();
			if (content == "") {
				alert("带有*号标记的是必填信息！");
				return;
			} else {
				studArray[i] = content;// 将学生的信息添加到数组
			}
		}
		// 获取单选按钮的值即为学生的性别
		studArray[5] = $(":radio[name='studSex']:checked").val();
		// 使用Ajaxa保存学生注册信息
		$.ajax({
			data : {
				studArra : studArray,
			},
			type : "JSON",// 向spingmvc发送数据的方式
			dataType : 'text',// 数据类型
			url : "saveRegisterStudInfo.do",// 访问springmvc的路径
			// 访问成功执行的方法
			success : function(responseText) {
				alert(responseText);
			},
			// 访问失败执行的方法
			error : function(responseText) {
				alert("erro");
			},
		});
	});
})