
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PruebaIT {
    
    private static WebDriver driver = null;
    
    
    public PruebaIT() {
    }
    
    @BeforeClass
    public static void inicializarDriver() {
        System.setProperty("webdriver.chrome.driver", "C://Users//ltino//Desktop//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("http://localhost:8080/2_APP/");
    }
    
    @AfterClass
    public static void liquidarDriver() {
        driver.quit();
    }

    @Test
    public void comprobarTemplate() {
        driver.get("http://localhost:8080/Inventario/");
        
        WebElement btnHome = driver.findElement(By.id("btnHome"));
        btnHome.click();        
        
        WebElement btnPelicula = driver.findElement(By.id("btnPelicula"));
        btnPelicula.click();
        
        WebElement btn2Pelicula = driver.findElement(By.name("j_idt17:j_idt66"));
        btn2Pelicula.click();
        
        WebElement textPelicula = driver.findElement(By.id("j_idt18:tituloPelicula"));
        textPelicula.sendKeys("Pelicula_1");
        
        WebElement text2Pelicula = driver.findElement(By.id("j_idt18:nombreActor"));
        text2Pelicula.sendKeys("Actor_1");
        
        WebElement text3Pelicula = driver.findElement(By.id("j_idt18:apellidoActor"));
        text3Pelicula.sendKeys("Apellido_1");        
        
        WebElement text4Pelicula = driver.findElement(By.id("j_idt18:duracionPelicula"));
        text4Pelicula.sendKeys("Duracion_1");
        
        Select dropdown = new Select(driver.findElement(By.id("j_idt18:idIdioma")));
        dropdown.selectByIndex(1);
        
        Select dropdown2 = new Select(driver.findElement(By.id("j_idt18:idIdioma")));
        dropdown2.selectByIndex(2);
        
        Select dropdown3 = new Select(driver.findElement(By.id("j_idt18:idIdioma")));
        dropdown2.selectByIndex(3);
        
        Select dropdown4 = new Select(driver.findElement(By.id("j_idt18:idSubtitulos")));
        dropdown4.selectByIndex(1);
        
        Select dropdown5 = new Select(driver.findElement(By.id("j_idt18:idSubtitulos")));
        dropdown5.selectByIndex(2);
        
        Select dropdown6 = new Select(driver.findElement(By.id("j_idt18:idSubtitulos")));
        dropdown6.selectByIndex(3);
        
        Select dropdown7 = new Select(driver.findElement(By.id("j_idt18:idGenero")));
        dropdown7.selectByIndex(1);
        
        Select dropdown8 = new Select(driver.findElement(By.id("j_idt18:idGenero")));
        dropdown8.selectByIndex(2);
        
        WebElement guardarPelicula = driver.findElement(By.name("j_idt18:j_idt31"));
        guardarPelicula.click();

// Revista
        
        WebElement btnRevista = driver.findElement(By.id("btnRevista"));
        btnRevista.click();

        WebElement btn2Revista = driver.findElement(By.name("j_idt17:j_idt57"));
        btn2Revista.click();
        
        WebElement textRevista = driver.findElement(By.id("j_idt18:tituloRevista"));
        textRevista.sendKeys("Titulo_1");
        
        WebElement text2Revista = driver.findElement(By.id("j_idt18:nombreRevista"));
        text2Revista.sendKeys("Revista_1");
        
        WebElement text3Revista = driver.findElement(By.id("j_idt18:fecha"));
        text3Revista.sendKeys("Fecha_1");
        
        WebElement text4Revista = driver.findElement(By.id("j_idt18:idEstado"));
        text4Revista.sendKeys("Estado_1");
        
        Select dropdown9 = new Select(driver.findElement(By.id("j_idt18:idEditorial")));
        dropdown9.selectByIndex(1);
        
        Select dropdown10 = new Select(driver.findElement(By.id("j_idt18:idEditorial")));
        dropdown10.selectByIndex(2);
        
// Libro
        
        WebElement btnLibro = driver.findElement(By.id("btnLibro"));
        btnLibro.click();
        
        WebElement btn2Libro = driver.findElement(By.name("j_idt17:j_idt75"));
        btn2Libro.click();
        
// Hojas
        
        WebElement btnHojas = driver.findElement(By.id("btnHojas"));
        btnHojas.click();
        
        WebElement btn2Hojas = driver.findElement(By.name("j_idt17:j_idt69"));
        btn2Hojas.click();
        
        WebElement textHoja = driver.findElement(By.id("j_idt18:duracionHoja"));
        textHoja.sendKeys("Duracion_1");
        
        WebElement text2Hoja = driver.findElement(By.id("j_idt18:nombreHoja"));
        text2Hoja.sendKeys("Hoja_1");
        
        WebElement text3Hoja = driver.findElement(By.id("j_idt18:fecha"));
        text3Hoja.sendKeys("Fecha_1");
        
        Select dropdown11 = new Select(driver.findElement(By.id("j_idt18:idHabilidad")));
        dropdown11.selectByIndex(1);
        
        Select dropdown12 = new Select(driver.findElement(By.id("j_idt18:idHabilidad")));
        dropdown12.selectByIndex(2);
        
        Select dropdown13 = new Select(driver.findElement(By.id("j_idt18:idHabilidad")));
        dropdown13.selectByIndex(3);
        
        Select dropdown14 = new Select(driver.findElement(By.id("j_idt18:idMaterial")));
        dropdown14.selectByIndex(1);
        
        Select dropdown15 = new Select(driver.findElement(By.id("j_idt18:idMaterial")));
        dropdown15.selectByIndex(2);
        
        Select dropdown16 = new Select(driver.findElement(By.id("j_idt18:idMaterial")));
        dropdown16.selectByIndex(3);
        
        Select dropdown17 = new Select(driver.findElement(By.id("j_idt18:idNivel")));
        dropdown17.selectByIndex(1);
        
        Select dropdown18 = new Select(driver.findElement(By.id("j_idt18:idNivel")));
        dropdown18.selectByIndex(2);
        
        Select dropdown19 = new Select(driver.findElement(By.id("j_idt18:idNivel")));
        dropdown19.selectByIndex(3);
        
        Select dropdown20 = new Select(driver.findElement(By.id("j_idt18:idNivel")));
        dropdown20.selectByIndex(4);
        
        Select dropdown21 = new Select(driver.findElement(By.id("j_idt18:idNivel")));
        dropdown21.selectByIndex(5);
        
        Select dropdown22 = new Select(driver.findElement(By.id("j_idt18:idNivel")));
        dropdown22.selectByIndex(6);
        
        Select dropdown23 = new Select(driver.findElement(By.id("j_idt18:idNivel")));
        dropdown23.selectByIndex(7);
        
        Select dropdown24 = new Select(driver.findElement(By.id("j_idt18:idNivel")));
        dropdown24.selectByIndex(8);
        
        Select dropdown25 = new Select(driver.findElement(By.id("j_idt18:idAutor")));
        dropdown25.selectByIndex(2);

        Select dropdown26 = new Select(driver.findElement(By.id("j_idt18:idAutor")));
        dropdown26.selectByIndex(3);
        
        Select dropdown27 = new Select(driver.findElement(By.id("j_idt18:idIdioma")));
        dropdown27.selectByIndex(1);

        Select dropdown28 = new Select(driver.findElement(By.id("j_idt18:idIdioma")));
        dropdown28.selectByIndex(2);

        Select dropdown29 = new Select(driver.findElement(By.id("j_idt18:idIdioma")));
        dropdown29.selectByIndex(3);
        
        Select dropdown30 = new Select(driver.findElement(By.id("j_idt18:idRating")));
        dropdown30.selectByIndex(3);
        
        Select dropdown31 = new Select(driver.findElement(By.id("j_idt18:idRating")));
        dropdown31.selectByIndex(4);
        
        WebElement guardarLibro = driver.findElement(By.name("j_idt18:j_idt36"));
        guardarLibro.click();

// Juegos
        
        WebElement btnJuegos = driver.findElement(By.id("btnJuegos"));
        btnJuegos.click();
        
        WebElement btn2Juegos = driver.findElement(By.name("j_idt17:j_idt72"));
        btn2Juegos.click();
        
        WebElement textJuego = driver.findElement(By.id("j_idt18:nombreJuego"));
        textJuego.sendKeys("Juego_1");
        
        WebElement text2Juego = driver.findElement(By.id("j_idt18:instrucciones"));
        text2Juego.sendKeys("Instrucciones_1");
        
        WebElement text3Juego = driver.findElement(By.id("j_idt18:unidad"));
        text3Juego.sendKeys("Unidad_1");
        
        WebElement text4Juego = driver.findElement(By.id("j_idt18:duracion"));
        text4Juego.sendKeys("Duracion_1");
        
        WebElement text5Juego = driver.findElement(By.id("j_idt18:fecha"));
        text5Juego.sendKeys("Fecha_1");

        Select dropdown32 = new Select(driver.findElement(By.id("j_idt18:idHabilidad")));
        dropdown32.selectByIndex(1);        
        
        Select dropdown33 = new Select(driver.findElement(By.id("j_idt18:idHabilidad")));
        dropdown33.selectByIndex(2);
        
        Select dropdown34 = new Select(driver.findElement(By.id("j_idt18:idHabilidad")));
        dropdown34.selectByIndex(3);
        
        Select dropdown35 = new Select(driver.findElement(By.id("j_idt18:idNivel")));
        dropdown35.selectByIndex(1);
        
        Select dropdown36 = new Select(driver.findElement(By.id("j_idt18:idNivel")));
        dropdown36.selectByIndex(2);
        
        Select dropdown37 = new Select(driver.findElement(By.id("j_idt18:idAutor")));
        dropdown37.selectByIndex(2);
        
        Select dropdown38 = new Select(driver.findElement(By.id("j_idt18:idAutor")));
        dropdown38.selectByIndex(3);
        
        Select dropdown39 = new Select(driver.findElement(By.id("j_idt18:idIdioma")));
        dropdown39.selectByIndex(1);
        
        Select dropdown40 = new Select(driver.findElement(By.id("j_idt18:idIdioma")));
        dropdown40.selectByIndex(2);
        
        Select dropdown41 = new Select(driver.findElement(By.id("j_idt18:idIdioma")));
        dropdown41.selectByIndex(3);
        
        Select dropdown42 = new Select(driver.findElement(By.id("j_idt18:idRating")));
        dropdown42.selectByIndex(2);

        Select dropdown43 = new Select(driver.findElement(By.id("j_idt18:idRating")));
        dropdown43.selectByIndex(3);
        
        WebElement guardarJuego = driver.findElement(By.name("j_idt18:j_idt36"));
        guardarJuego.click();
        
    }
    
}
