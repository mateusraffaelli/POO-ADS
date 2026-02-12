# Sistema de Controle de Versão
## Configuração inicial para uso do Git
Configurar nome e e-mail no Git
é necessário para identificar a autoria de cada alteração (commit) no histórico do projeto, garantindo rastreabilidade e colaboração organizada. O Git usa essas informações para registrar quem fez o quê, permitindo que plataformas como GitHub/GitLab vinculem os commits à sua conta correta.

```
git config --global user.name "Seu Nome"
git config --global user.email "seuemail@exemplo.com"
```
### - Configuração de nome de usuário e e-mail no Git
### - Criando Personal Access Token (PAT) no GitHub
o Personal Access Token (PAT) é uma senha alternativa e temporária, composta por uma sequência de caracteres, usada exclusivamente para autenticar o Git e outras ferramentas no GitHub. O PAT é necessário principalmente por conta da segurança, pois você escolhe o que o token pode fazer e pode excluí-lo individualmente.

Passo a passo para criar um Personal Access Token (PAT) no GitHub:

1. No canto superior direito, clique na sua foto de perfil e selecione Settings.

2. No menu lateral esquerdo, clique em Developer settings.

3. Clique em Personal access tokens e escolha a opção Tokens (classic).

4. Clique no botão Generate new token e selecione Generate new token (classic).

5. No campo Note, dê um nome ao token. Em Expiration, escolha um prazo de validade. E em Select scopes, selecione as permissões necessárias.

6. Por fim clique em Generate token e copie o token gerado.

### - Salvar em cache as credenciais do PAT
A principal motivação para salvar o PAT em cache é juntar segurança a produtividade, eliminando a necessidade de repetir tarefas manuais desgastantes. Sem o cache, o Git solicitará seu nome de usuário e o token em todo push e pull. Salvar as credenciais torna o processo instantâneo e o token fica armazenado de forma criptografada pelo sistema operacional.

```
git config −−global credential.helper 'cache −−timeout=3600'
```

## Qual a diferença entre git merge e git rebase?