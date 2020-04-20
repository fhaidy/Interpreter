import java.lang.reflect.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String questionAsked = JOptionPane.showInputDialog(frame, "What do you want to convert");
        Context question = new Context(questionAsked);
        String fromConversion = question.getFromConversion();
        String toConversion = question.getToConversion();
        double quantity = question.getQuantity();
        try {
            Class tempClass = Class.forName(fromConversion);
            Constructor con = tempClass.getConstructor();
            Object convertFrom = (Converter) con.newInstance();
            Class[] methodParams = new Class[]{Double.TYPE};
            Method conversionMethod = tempClass.getMethod(toConversion, methodParams);
            Object[] params = new Object[]{new Double(quantity)};
            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);
            String answerToQues = question.getResponse() +
                    toQuantity + " " + question.toPlural(toConversion);
            JOptionPane.showMessageDialog(null,answerToQues);

            frame.dispose();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}