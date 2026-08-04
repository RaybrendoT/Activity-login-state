# Activity Login State 🔐

Aplicativo Android desenvolvido em **Kotlin** utilizando **Jetpack Compose**, com foco no gerenciamento de estado em uma tela de login.

O projeto demonstra conceitos fundamentais de desenvolvimento Android moderno, incluindo:

* Componentes declarativos com Jetpack Compose
* Gerenciamento de estado da interface
* Validação de formulário
* Controle de habilitação de botões
* Navegação entre Activities
* Passagem de dados utilizando Intent

---

## 📱 Sobre o projeto

O **Activity Login State** é um aplicativo simples de autenticação que apresenta uma tela de login contendo:

* Campo de e-mail
* Campo de senha
* Botão "Entrar"
* Link "Esqueci minha senha"

O botão de login permanece desabilitado enquanto os campos obrigatórios não estiverem preenchidos.

Após o login, o usuário é direcionado para uma tela principal contendo informações do perfil acessado.

---

## 🚀 Tecnologias utilizadas

* Kotlin
* Android Studio
* Jetpack Compose
* Material 3
* ComponentActivity
* Intent
* State Management (`remember`, `mutableStateOf`)
* Compose Preview

---

## 🏗️ Estrutura do projeto

```
app/
 └── java/com/example/teste_fpf/
      |
      ├── MainActivity.kt
      ├── HomeActivity.kt
      ├── LoginScreen.kt
      ├── HomeScreen.kt
      └── ui/
          └── theme/
```

---

## 🔑 Funcionalidades

### Tela de Login

* Entrada de e-mail
* Entrada de senha protegida
* Validação dos campos
* Botão com estado dinâmico

Exemplo:

```kotlin
Button(
    enabled = email.isNotEmpty() && senha.isNotEmpty(),
    onClick = {
        // realizar login
    }
)
```

---

## 🔄 Gerenciamento de Estado

O projeto utiliza estado elevado para controlar os dados da tela.

Exemplo:

```kotlin
var email by remember {
    mutableStateOf("")
}
```

O estado é mantido no nível superior do componente e enviado para os elementos filhos quando necessário.

Benefícios:

* Código mais organizado
* Componentes reutilizáveis
* Controle previsível da UI

---

## 🏠 Tela após Login

Após autenticação, o aplicativo abre a `HomeActivity` passando o e-mail informado.

Fluxo:

```
LoginActivity
      |
      | Intent
      ↓
HomeActivity
      |
      ↓
HomeScreen(email)
```

Exemplo:

```kotlin
intent.putExtra(
    "EMAIL",
    email
)
```

Recuperação:

```kotlin
val email =
    intent.getStringExtra("EMAIL") ?: ""
```

---

## 🎨 Preview

O projeto contém previews utilizando Jetpack Compose para facilitar o desenvolvimento da interface.

Exemplo:

```kotlin
@Preview
@Composable
fun LoginPreview(){
    LoginScreen()
}
```

---

## ▶️ Como executar

### Pré-requisitos

* Android Studio instalado
* JDK configurado
* Android SDK atualizado

### Executar

Clone o projeto:

```bash
git clone https://github.com/RaybrendoT/Activity-login-state.git
```

Abra no Android Studio:

```
File → Open → Activity-login-state
```

Execute em:

* Emulator Android
* Dispositivo físico conectado via USB

---

## 📚 Objetivo de aprendizado

Este projeto foi desenvolvido para praticar:

✅ Jetpack Compose
✅ Estados em aplicações Android
✅ Comunicação entre telas
✅ Componentização de UI
✅ Boas práticas de desenvolvimento mobile

---

## 👨‍💻 Autor

**Raybrendo Trindade**

Projeto desenvolvido para estudos de desenvolvimento Android com Kotlin e Jetpack Compose.
