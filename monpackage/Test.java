package monpackage;
// dossier package pas de caractères spéciaux ni majuscule
public class Test {
    public String var;
    public Test(String var){
        this.var = var;
    }
}
// attribut en public
// revoir void
/*
 * si retrait public => défaut public
 * public class Test {
     String var;
     Test(String var){
        this.var = var;
    }
}
*mais attention en cas de package sans info comme public pas d'import possible
*par défaut public, mais pas dans le même dossier que APP, donc pas accessible.
*/
