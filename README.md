<h1> Desafio: POO Java usando Design Patterns e Spring Boot</h1>

<p> 💎 O objetivo principal é colocar em prática o framework Spring Boot com Design Patterns: <strong>POO, DESIGN PATTERNS e REST API</strong> através de um projeto Java. </p>

<h2>🛑 Ferramantas</h2>

<p>
✅ Linguagem Java<br>
✅ Java JDK 11<br>
✅ IDE para desenvolvimento Java <br>
✅ Git<br>
✅ Conta no GitHub<br>
</p>

<h3>💎Gitignore</h3>

<p>Foi acrescentado no gitignore complementos relativos as IDE(s) Eclipse, VisualStudio Code
e Intellij, além da linguagem Java através da criação de arquivo através do link: https://www.toptal.com/developers/gitignore</p>

<h3>💎Spring Boot</h3>

<p>Foram configuradas dependências através do framework spring: Spring web, Spring Data JPA, H2 Database e OpenFeing, usando Java 11 e Maven Project através do link: https://start.spring.io/</p>

<p>A dependência do OpenAPI/Swagger foi adicionada manualmente no pom.xml (para que esta dependência não apresentasse erro, a IDE deve ser reinicializada ou atualizada).</p>

<h2> 👣 Passo-a-Passo</h2>

<p>
<strong>	1.</strong> ABSTRAIR o DOMÍNIO Vacinação COVID-19 e MODELAR seus ATRIBUTOS E MÉTODOS <br>
<strong>	2.</strong> Criar as CLASSES: Produto, Estoque, e relaciona-las <br>
<strong>	3.</strong> As CLASSES Curso, Mentoria e Devs também serão MODELADOS, ou seja, criaremos seus ATRIBUTOS E MÉTODOS <br> 
<strong>	4.</strong> Para que o código fique mais legível e de fácil manutenção, iremos utilizar de algumas das ferramentas que o PARADIGMA DE ORIENTAÇÃO A OBJETOS (POO) nos oferece: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO <br>
<strong>	5.</strong> E para representar CLASSES que foram criadas e relacionadas, iremos transforma-las em OBJETOS<br>
</p>

<h2>Funções e Procedimentos</h2>

<strong>     1.</strong>adicionarRegistro: adiciona um registro de vacinação ao objeto RelacaoVacinados.<br>
<strong>     2.</strong>totalVacinadosAcimaDe: calcula o número de pessoas vacinadas com as duas primeiras doses acima de determinada idade.<br>
<strong>     3.</strong>listarPessoasQueNaoTomaram2aDose: retorna a relação de pessoas que tomaram a primeira, mas não a segunda dose.<br>
<strong>     4.</strong>totalDePessoasQueNaoTomaram2aDose: retorna o número de pessoas que tomaram a primeira, mas não a segunda dose.<br>
<strong>     5.</strong>totalPessoasVacinadasQueTomaram2aDose: retorna o número de pessoas que tomaram a primeira e segunda doses.<br>

----

<h2> 📚 Execução da API REST (POO) </h2>

<p>
A visão de Orientação a Objetos (OO) é aquela de um mundo de objetos que interagem.<br>
Este paradigma é um modelo de análise, projeto e programação baseado na aproximação entre o mundo real e o mundo virtual, através da criação e interação entre classes, atributos, métodos, objetos, entre outros.<br>
São 4 os pilares principais do POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO. 
</p>


<h3>🔺 ABSTRAÇÃO:</h3>

<p>
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.</p>

<h3>🔺 ENCAPSULAMENTO:</h3>

<p> Encapsular significa esconder a implementação dos objetos. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.</p>

<h3>🔺 HERANÇA:</h3>

<p>Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.</p>

<h3> 🔺 POLIMORFISMO:</h3>

<p>Capacidade de um objeto poder ser referenciado de várias formas. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele. A capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica é chamada de polimorfismo.</p>
<br>
<h2 align="center"> ‼️ CONCEITOS FUNDAMENTAIS POO ‼️ </h2>
<p>
<h3>🔻 DOMÍNIO:</h3> 
<p>Domínio da aplicação, também conhecida como camada de negócio ou de objetos de negócio, é aquela onde estão localizadas as classes que fazem parte do domínio do problema, ou seja, classes correspondentes a objetos que fazem parte da descrição do problema.</p>

<h3>🔻 CLASSE: </h3> 
<p>Um elemento do código que tem a função de representar objetos do mundo real. Dentro dela é comum declararmos atributos e métodos, que representam, respectivamente, as características e comportamentos desse objeto.</p>

<h3>🔻 ATRIBUTO: </h3>
<p>Atributos são, basicamente, a estrutura de dados que vai representar a classe. Os atributos também são conhecidos como VARIÁVEL DE CLASSE, e podem ser divididos em dois tipos básicos: atributos de instância e de classe.</p>

<h3>🔻 VARIÁVEL: </h3>
<p>Uma “região de memória (do computador) previamente identificada cuja finalidade é armazenar os dados ou informações de um programa por um determinado espaço de tempo”.</p>

<h3>🔻 MÉTODO: </h3>
<p> métodos representam os estados e ações dos objetos e classes.</p>

<h3>🔻 OBJETO: </h3>
<p>Em POO, objeto é um "molde" de uma determinada classe, que passa a existir a partir de uma instância da classe. A classe define o comportamento do objeto, usando atributos (propriedades) e métodos (ações).
Objeto em ciência da computação, é uma referência a um local da memória que possui um valor. Um objeto pode ser uma variável, função, ou estrutura de dados.</p> 

<h3>🔻 INSTÂNCIA: </h3>
<p>Uma instância de uma classe é um novo objeto criado dessa classe, com o operador new. Instanciar uma classe é criar um novo objeto do mesmo tipo dessa classe. Uma classe somente poderá ser utilizada após ser instanciada.</p>
    
------------
<br>


