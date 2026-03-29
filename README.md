# Factura-Reporte

## Descripción del Proyecto
Factura-Reporte es una aplicación desarrollada en Java que permite gestionar y consultar facturas almacenadas en una base de datos. La aplicación incluye funcionalidades para filtrar facturas por rango de fechas, mostrar los resultados en una tabla interactiva, y exportar la información de una factura seleccionada a un archivo TXT.

## Funcionalidades Principales
1. **Consulta de Facturas**:
   - Filtrar facturas por rango de fechas.
   - Mostrar los resultados en una tabla interactiva.

2. **Interacción con la Tabla**:
   - Al hacer clic en una fila de la tabla, se actualizan los campos de texto y el combo box con la información de la factura seleccionada.

3. **Exportación de Facturas**:
   - Exportar la información de una factura seleccionada a un archivo TXT.
   - Abrir automáticamente el archivo exportado.

## Estructura del Proyecto
- **src/factura/vista/Reporte.java**: Contiene la lógica principal de la aplicación, incluyendo la consulta y exportación de facturas.
- **src/factura/dao/ConexionBD.java**: Maneja la conexión a la base de datos.

## Uso de la Aplicación
### Consulta de Facturas
1. Ingrese un rango de fechas en los campos "Fecha inicio" y "Fecha fin".
2. Presione el botón "Consultar".
3. Los resultados se mostrarán en la tabla interactiva.

### Interacción con la Tabla
1. Haga clic en una fila de la tabla.
2. El campo "Factura" y el combo box "Cliente" se actualizarán con la información de la factura seleccionada.

### Exportación de Facturas
1. Seleccione una factura haciendo clic en una fila de la tabla.
2. Presione el botón "Exportar".
3. La factura se exportará a un archivo TXT en la carpeta del proyecto.
4. El archivo se abrirá automáticamente.

## Requisitos
- Java 8 o superior.
- Base de datos MySQL con las tablas `facturas` y `clientes` configuradas.

## Configuración de la Base de Datos
1. Configure la clase `ConexionBD.java` con los parámetros de conexión adecuados:
   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/factura_reporte";
   private static final String USUARIO = "root";
   private static final String CONTRASENA = "";
   ```

2. Asegúrese de que las tablas `facturas` y `clientes` tengan los siguientes campos:
   - **facturas**: `numeroFactura`, `fecha`, `idCliente`, `observaciones`, `total`.
   - **clientes**: `idCliente`, `nombre`.

## Notas
- El archivo TXT exportado se guarda en la misma carpeta del proyecto.
- En caso de errores, se mostrarán mensajes en la consola y en la interfaz gráfica.

## Créditos
Desarrollado por USUARIO.# Ordenes-de-Servicio
