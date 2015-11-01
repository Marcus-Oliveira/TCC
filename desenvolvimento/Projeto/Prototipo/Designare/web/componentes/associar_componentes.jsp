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
        <section id="application">
            <div class="container">
                <div class="area_application consultar_componentes">
                    <h1>Projeto FatecSUL - Diagrama de Caso de Uso - UseCase01</h1>
                    <div class="item_listagem">
                        <h3 class="text-center">Associar componente</h3>
                        <form name="form_assoc_componente" id="form_projeto">
                            <div class="form-group">
                                <label for="tipo">Tipo da associação: </label> 
                                <select class="form-control">
                                    <option value="simples">Simples</option>
                                    <option value="include">Include</option>
                                    <option value="extend">Extend</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="tipo">Componente1: </label> 
                                <select class="form-control">
                                    <option value="simples">Ator ou UC</option>
                                    <option value="include">Ator ou UC</option>
                                    <option value="extend">Ator ou UC</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="tipo">Componente2: </label> 
                                <select class="form-control">
                                    <option value="simples">Ator ou UC</option>
                                    <option value="include">Ator ou UC</option>
                                    <option value="extend">Ator ou UC</option>
                                </select>
                            </div>
                            
                            <button type="submit">ASSOCIAR</button>
                            <!--
                            <button type="submit">EXCLUIR</button>
                            <button type="submit">EXPORTAR</button>
                            -->
                        </form>
                        <button type="submit">CONSULTAR COMPONENTES CRIADOS</button>
                    </div>                    
                </div>
            </div>
        </section>
    </body>
</html>
