<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%><%@taglib
	uri="http://java.sun.com/jsf/core" prefix="f"%><%@ page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<f:view>
	<form><h:form>
		
		<h:inputText value="#{calculatorMB.number1}"></h:inputText>
		<h:inputText value="#{calculatorMB.number2}"></h:inputText>
		<br>
		<h:outputText value="#{calculatorMB.result}"></h:outputText>  
		<h:commandButton action="#{calculatorMB.add}">
		</h:commandButton>
		<h:commandButton value="call save question temp" action="#{saveQuestion.saveQuestion}"></h:commandButton>
	</h:form></form>
</f:view>
</body>
</html>