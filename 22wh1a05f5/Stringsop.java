����   4 T  newproject/Stringsop  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lnewproject/Stringsop; rev &(Ljava/lang/String;)Ljava/lang/String;   
    java/lang/String   split '(Ljava/lang/String;)[Ljava/lang/String;  java/lang/StringBuilder
     valueOf &(Ljava/lang/Object;)Ljava/lang/String;
      (Ljava/lang/String;)V
  " # $ append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  & ' ( toString ()Ljava/lang/String; str1 Ljava/lang/String; word [Ljava/lang/String; result i I StackMapTable , main ([Ljava/lang/String;)V 5 java/util/Scanner	 7 9 8 java/lang/System : ; in Ljava/io/InputStream;
 4 =  > (Ljava/io/InputStream;)V	 7 @ A B out Ljava/io/PrintStream; D enter the string;

 F H G java/io/PrintStream I   println
 4 K L ( nextLine
  N   args sc Ljava/util/Scanner; 
SourceFile Stringsop.java !               /     *� �    
                    	       �     Q*� LM+�d>� <� � Y,� � +2� !� %M� � Y,� � +2� !� !� %M�����,�    
   & 	      
     	 + 
 .  H  O     *    Q ) *    J + ,  
 G - *   @ . /  0    �  1  	 2 3     q     #� 4Y� 6� <L� ?C� E+� JM� ?,� M� E�    
              "          # O ,     P Q    ) *   R    S