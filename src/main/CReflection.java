package main;
import java.lang.reflect.*;
import RH.membro;
import bem.Multimidia;

public class CReflection {

    public void ImprimeAtributoMembro() {
        try {
            Class<?> ClasseMembro = membro.class;

            Field[] atributos = ClasseMembro.getDeclaredFields();

            System.out.println("Atributos da classe membro:");

            for (Field field : atributos) {
                String NomeAtributo = field.getName();
                Class<?> TipoAtributo = field.getType();
                System.out.println("Nome do atributo: " + NomeAtributo);
                System.out.println("Tipo do atributo: " + TipoAtributo.getSimpleName());
            }
        } catch (Exception e) {
            System.err.println("Erro ao imprimir atributos da classe membro: " + e.getMessage());
        }
    }
    
    public void ImprimeMetodosMembro() {
        try {
            Class<?> ClasseMembro = membro.class;

            Method[] metodos = ClasseMembro.getDeclaredMethods();

            System.out.println("Métodos da classe membro:");

            for (Method method : metodos) {
                String NomeMetodo = method.getName();
                Class<?> TipoRetorno = method.getReturnType();
                System.out.println("Nome do método: " + NomeMetodo);
                System.out.println("Tipo de retorno: " + TipoRetorno.getSimpleName());
            }
        } catch (Exception e) {
            System.err.println("Erro ao imprimir métodos da classe membro: " + e.getMessage());
        }
    }
    
    public void ImprimeAtributoMultimidia() {
        try {
            Class<?> ClasseMultimidia = Multimidia.class;

            Field[] atributos = ClasseMultimidia.getDeclaredFields();

            System.out.println("Atributos da classe Multimidia:");

            for (Field field : atributos) {
                String NomeAtributo = field.getName();
                Class<?> TipoAtributo = field.getType();
                System.out.println("Nome do atributo: " + NomeAtributo);
                System.out.println("Tipo do atributo: " + TipoAtributo.getSimpleName());
            }
        } catch (Exception e) {
            System.err.println("Erro ao imprimir atributos da classe Multimidia: " + e.getMessage());
        }
    }
    
    public void ImprimeMetodosMultimidia() {
        try {
            Class<?> ClasseMultimidia = Multimidia.class;

            Method[] metodos = ClasseMultimidia.getDeclaredMethods();

            System.out.println("Métodos da classe Multimidia:");

            for (Method method : metodos) {
                String NomeMetodo = method.getName();
                Class<?> TipoRetorno = method.getReturnType();
                System.out.println("Nome do método: " + NomeMetodo);
                System.out.println("Tipo de retorno: " + TipoRetorno.getSimpleName());
            }
        } catch (Exception e) {
            System.err.println("Erro ao imprimir métodos da classe Multimidia: " + e.getMessage());
        }
    }
}
