# Desafío 5 - Java Swing

Proyecto con 4 ejercicios prácticos de interfaces gráficas usando Java Swing.

## 📋 Ejercicios Implementados

### 1️. Calculadora Simple
**Archivo:** `Ejercicio1.java`

Calculadora con interfaz gráfica que incluye:
- Botones numéricos (0-9)
- Operaciones básicas: suma (+), resta (-), multiplicación (*), división (/)
- Validación de división por cero
- Resultados sin decimales para números enteros

**Componentes:** JTextField, JButton, JPanel

---

### 2️. Selector de Tamaño de Fuente
**Archivo:** `Ejercicio2.java`

Aplicación que permite cambiar dinámicamente el tamaño de fuente de un texto.
- ComboBox con tamaños: 12, 14, 16, 18, 20
- Cambio en tiempo real del tamaño de fuente
- JLabel "Texto de Ejemplo" que se actualiza automáticamente

**Componentes:** JComboBox, JLabel

---

### 3️. Selector de Lenguajes de Programación
**Archivo:** `Ejercicio3.java`

Lista interactiva con información de lenguajes de programación.
- **Lenguajes incluidos:** Java, Python, C++, JavaScript, Rust, Golang, Solidity, PHP, MQL5
- Doble clic muestra información detallada de cada lenguaje
- Modo de selección simple
- Scroll automático para navegación

**Componentes:** JList, JScrollPane, MouseListener

---

### 4️. Validación de Edad
**Archivo:** `Ejercicio4.java`

Sistema de validación de edad con múltiples controles.
- Valida si el usuario es mayor o menor de 18 años
- Manejo de excepciones para texto no numérico
- Validación de rangos (números negativos, edades irreales > 120)
- Mensajes personalizados según cada caso
- Limpieza automática del campo después de validar

**Componentes:** JTextField, JButton, JLabel

---

## Cómo Ejecutar

### Opción 1: Desde NetBeans (Recomendado)
1. Abrí el proyecto `Desafio5` en NetBeans
2. Click derecho en el ejercicio que querés probar (ej: `Ejercicio1.java`)
3. Seleccioná **Run File** (o presioná `Shift + F6`)

### Opción 2: Desde Terminal
```bash
# Navegar a la carpeta del proyecto
cd Desafio5

# Compilar un ejercicio
javac src/Ejercicio1.java

# Ejecutar
java -cp src Ejercicio1
```

---

## Requisitos

- **JDK:** 8 o superior
- **IDE:** NetBeans (recomendado) o cualquier IDE compatible con Java
- **SO:** Windows, macOS o Linux

---

## 📸 Características Técnicas

### Gestión de Eventos
- `ActionListener`: Botones y ComboBox
- `MouseListener`: Doble clic en JList
- `KeyListener`: Tecla Enter (opcional)

### Componentes Swing Utilizados
- `JFrame`: Ventana principal
- `JPanel`: Organización de componentes
- `JButton`: Botones interactivos
- `JTextField`: Entrada de texto
- `JComboBox`: Lista desplegable
- `JList`: Lista de elementos
- `JScrollPane`: Scroll para listas
- `JLabel`: Etiquetas de texto

### Layouts
- `AbsoluteLayout`: Posicionamiento manual
- `GroupLayout`: Diseño automático de NetBeans

### Manejo de Excepciones
- `NumberFormatException`: Validación de entrada numérica
- `try-catch`: Captura y manejo de errores

### Validaciones Implementadas
- Entrada de usuario vacía
- Texto no numérico
- Rangos numéricos (negativos, valores irreales)
- División por cero

---

## Convenciones de Nombres

- `btn` → JButton (ej: `btnValidar`, `btnSumar`)
- `txt` → JTextField (ej: `txtEdad`, `txtResultado`)
- `lbl` → JLabel (ej: `lblTextoEjemplo`)
- `cmb` → JComboBox (ej: `cmbTamaño`)
- `lst` → JList (ej: `lstLenguajes`)

---

## Objetivos 

- ✅ Creación de interfaces gráficas con Swing
- ✅ Manejo de eventos de usuario
- ✅ Validación de entrada de datos
- ✅ Manejo de excepciones
- ✅ Uso de diferentes componentes Swing
- ✅ Organización de código en métodos
- ✅ Diseño de layouts

---