package main;
import java.lang.reflect.*;
import RH.membro;

public class CReflection {

    public void ImprimeAtributoMembro() {
        Class<?> ClasseMembro = membro.class;

        Field[] atributos = ClasseMembro.getDeclaredFields();

        System.out.println("Atributos da classe membro:");

        for (Field field : atributos) {
            String NomeAtributo = field.getName();
            Class<?> TipoAtributo = field.getType();
            System.out.println("Nome do atributo: " + NomeAtributo);
            System.out.println("Tipo do atributo: " + TipoAtributo.getSimpleName());
        }
    }
    
    public void ImprimeMetodosMembro() {
        Class<?> ClasseMembro = membro.class;

        Method[] metodos = ClasseMembro.getDeclaredMethods();

        System.out.println("Métodos da classe membro:");

        for (Method method : metodos) {
            String NomeMetodo = method.getName();
            Class<?> TipoRetorno = method.getReturnType();
            System.out.println("Nome do método: " + NomeMetodo);
            System.out.println("Tipo de retorno: " + TipoRetorno.getSimpleName());
        }
    }
}
