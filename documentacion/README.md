# Documentación del Proyecto Factura-Reporte

## Introducción
Este proyecto implementa una estructura basada en el patrón de diseño **MVC (Modelo-Vista-Controlador)** con la adición de un módulo **DAO (Data Access Object)** para gestionar las operaciones de acceso a datos. A continuación, se describe cada componente del proyecto.

---

## Estructura del Proyecto

```
Factura-Reporte/
├── src/
│   ├── controlador/
│   ├── dao/
│   ├── modelo/
│   ├── reporte/
│   └── vista/
└── documentacion/
    └── README.md
```

---

## Componentes

### 1. **Modelo**
Ubicación: `src/modelo`

El paquete `modelo` contiene las clases que representan las entidades principales del sistema. Estas clases encapsulan los datos y la lógica de negocio.

#### Clases:
- **Factura.java**: Representa una factura con atributos como `id`, `cliente` y `total`.
- **Reporte.java**: Representa un reporte con atributos como `id`, `descripcion` y `fecha`.

---

### 2. **DAO (Data Access Object)**
Ubicación: `src/dao`

El paquete `dao` contiene las clases responsables de realizar las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre las entidades del modelo.

#### Clases:
- **FacturaDAO.java**: Gestiona las operaciones CRUD para la entidad `Factura`.
- **ReporteDAO.java**: Gestiona las operaciones CRUD para la entidad `Reporte`.

---

### 3. **Controlador**
Ubicación: `src/controlador`

El paquete `controlador` contiene las clases que actúan como intermediarios entre el modelo y la vista. Estas clases gestionan la lógica de la aplicación.

#### Clases:
- **FacturaControlador.java**: Gestiona las operaciones relacionadas con las facturas.
- **ReporteControlador.java**: Gestiona las operaciones relacionadas con los reportes.

---

### 4. **Vista**
Ubicación: `src/vista`

El paquete `vista` contiene las interfaces gráficas o formularios que interactúan con el usuario.

#### Archivos:
- **Factura.form** y **Factura.java**: Formularios para gestionar facturas.
- **Reporte.form** y **Reporte.java**: Formularios para gestionar reportes.

---

## Cómo Funciona

1. **Modelo**: Define las entidades principales del sistema.
2. **DAO**: Proporciona métodos para realizar operaciones CRUD sobre las entidades.
3. **Controlador**: Gestiona la lógica de negocio y conecta el modelo con la vista.
4. **Vista**: Proporciona la interfaz de usuario para interactuar con el sistema.

---

## Próximos Pasos

1. Crear la base de datos y conectar las clases DAO con la misma.
2. Implementar las vistas gráficas en los formularios.
3. Probar la funcionalidad completa del sistema.

---

## Autor
Este proyecto fue desarrollado como parte de un ejercicio de implementación del patrón MVC con DAO.
