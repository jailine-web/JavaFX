### Links 

#### Link do executáveldo scene builder: https://gluonhq.com/products/scene-builder/
#### Local onde o SceneBuilder foi instalado: D:\Users\jaysa\AppData\Local\SceneBuilder\SceneBuilder.exe

#### Link biblioteca JavaFX sdk : https://gluonhq.com/products/javafx/

#### Biblioteca http://download.eclipse.org/efxclipse/updates-released/3.4.1/site/

### Baixar biblioteca no eclipse 

#### Help --> new software --> link da biblioteca --> marca a biblioteca --> espera --> 
reinicia o eclipse

Baixar o JavaFX SDK: https://gluonhq.com/products/javafx

o Salvar em uma pasta "fácil", de preferência com nome sem espaços 
 Exemplo: C:\java-libs 

 Instalar o plug-in E(fx)clipse no Eclipse (ATENÇÃO: versão 3.4.1 ou superior)
o Help -> Install new Software
No campo "Work with" insere o link direto: http://download.eclipse.org/efxclipse/updates-released/3.4.1/site/
o Localize e(fx)clipse
o Next Next etc.
o Reinicie o Eclipse

 Referenciar o SceneBuilder no Eclipse:
o Window -> Preferences -> JavaFX
o Entrar o caminho completo do arquivo executável do Scene Builder
 Exemplo: C:\Users\seunome\AppData\Local\SceneBuilder\SceneBuilder.exe
 Criar uma User Library no Eclipse com o nome de JavaFX: 
o Window -> Preferences -> Java -> Build Path -> User Libraries -> New 
o Dê o nome de User Library 
o Add External Jars (aponte para a pasta bin do JavaFX) 

Criação do projeto:

o File -> New -> Other -> JavaFX Project
o Dê um nome ao projeto e clique Next
o Na aba Libraries, selecione Modulepath, clique Add Library, e selecione JavaFX
o Clique Finish
o Module Info: Don't Create

Configuração do build:

o Botão direito no projeto -> Run As -> Run Configurations -> Arguments -> VM Arguments
o Copiar o conteúdo abaixo, adaptando para sua pasta:
--module-path "C:\java-libs\javafx-sdk\lib" --add-modules=javafx.fxml,javafx.controls

FXML: é uma linguagem de marcação para desenhar a tela com o scene.




