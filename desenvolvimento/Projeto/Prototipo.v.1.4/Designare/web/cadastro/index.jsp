<%-- 
    Document   : index
    Created on : 24/10/2015, 16:41:59
    Author     : marcus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Designare - Ferramenta CASE UML para deficientes visuais</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="assets/css/main.css">
        <link rel="stylesheet" type="text/css" href="assets/css/utils.css">
        <!-- Latest compiled and minified CSS -->
        <!--
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        -->
        <!-- Latest compiled and minified JavaScript -->
        <!--
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        -->
    </head>
    <body>
        <section id="acessibility_icons">
            <div class="container">Icones de acessibilidade</div>
        </section>
        <header class="main-header" id="inicio">
            <nav class="main-header__menu">
                <ul class="menu__nav">
                    <li class="menu_item"><a class="active" href="#" data-action="anchor">Home</a></li>
                    <li class="menu_item"><a href="#" data-action="anchor" class="">Perfil</a></li>
                    <li class="menu_item"><a href="flow1_criarprojeto.html" data-action="anchor">Criar novo projeto</a></li>
                    <li class="menu_item"><a href="#" data-action="toogleRegulamento" data-active="0">Meus projetos</a></li>
                    <li class="menu_item"><a href="#" data-action="toogleFaleConosco" data-active="0">Meus diagramas</a></li>
                    <li class="menu_item"><a href="#" data-action="toogleFaleConosco" data-active="0">Contato</a></li>
                </ul>
            </nav>
        </header>
        <div class="container">
            <div class="area_application">
                <h1>Cadastre-se</h1>
<!--                <form name="form_cadastro" id="frm_cadastro">
                    <div class="form-group">
                        <label for="nome">Nome: </label> 
                        <input autocomplete="off" name="nome" id="nome" class="form-control" type="text">
                    </div>
                    <div class="form-group">
                        <label for="email">Email: </label>
                        <input autocomplete="off" name="email" id="email" class="form-control" type="email">
                    </div>
                    <div class="form-group">
                        <label for="senha">Senha: </label> 
                        <input autocomplete="off" name="senha" id="senha" class="form-control" type="password">
                    </div>
                    <button type="submit">CADASTRAR</button>
                    
                    <button type="submit">EXCLUIR</button>
                    <button type="submit">EXPORTAR</button>
                    
                </form>-->
                <s:form action="/cadastrar" method="post">
                    <s:textfield label="Nome" name="nome" />
                    <s:textfield label="Email" name="email" />
                    <s:password label="Senha" name="senha" />
                    <s:submit label="Cadastrar" value="Cadastrar"></s:submit>
                </s:form>
            </div>

        </div>
    </body>
</html>
