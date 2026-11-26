# Ejercicio: Precios de una tienda con integración continua

## Objetivo

1. Crear un workflow de GitHub Actions que, en cada `push`:
   - compile el proyecto Java,
   - ejecute `TiendaTest`,
   - ejecute `Main`.
2. Comprobar en la pestaña **Actions** que el test falla.
3. Encontrar el fallo del código, corregirlo y hacer `push` hasta que todo salga en verde.

## Archivos

| Archivo | Descripción |
|---|---|
| `Tienda.java` | Clase con `aplicarDescuento()` y `precioConIva()` (IVA del 21 %) |
| `TiendaTest.java` | Test con `assert` |
| `Main.java` | Programa principal que muestra el precio con descuento y con IVA |

El workflow (`.github/workflows/...`) lo tienes que crear tú.

## Reto opcional

Cuando todo esté en verde, amplía el workflow para que genere un `.jar` ejecutable
y lo guarde como **artefacto** descargable desde la pestaña Actions.
