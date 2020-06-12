# Втора лабораториска вежба по Софтверско инженерство
## Сергеј Петковски, бр. на индекс 173056
### Група на код:
Ја добив групата на код 1

### Control Flow Graph
<img src="CFG.png" width="500">

### Цикломатска комплексност
Цикломатската комплексност на овој код е 7, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=6, па цикломатската комплексност изнесува 7.
### Тест случаи според критериумот Multiple condition
<br>
Condition 1: 
<br>
<b>if (user.getUsername()!=null && user.getEmail()!=null && !allUsers.contains(user.getUsername()))</b>
<table>
  <tr>
  <th>Combination</th>
    <th>Test case</th>
    <th>Branch</th>
  </tr>
  <tr>
    <td>TTT</td> <td>user.getUsername()=="sergej" && user.getEmail()=="sergej.petkovski@finki.mk" && !allUsers.contains(user.getUsername())</td> <td>2-3</td>
  </tr>
  <tr>
    <td>FXX</td> <td>user.getUsername()==null</td> <td>2-11</td>
  </tr>
  <tr>
    <td>TFX</td> <td>user.getUsername()=="sergej" && user.getEmail()==null</td> <td>2-11</td>
  </tr>
  <tr>
    <td>TTF</td> <td>user.getUsername()=="sergej" && user.getEmail()=="sergej.petkovski@finki.mk" && !allUsers.contains(user.getUsername())==false</td> <td>2-11</td>
  </tr>
</table>
<br>

Condition 2: 
<br>
<b>if (atChar && user.getEmail().charAt(i)=='.')</b>
<table>
  <tr>
  <th>Combination</th>
    <th>Test case</th>
    <th>Branch</th>
  </tr>
  <tr>
    <td>TT</td> <td>user.getEmail()=="sergej.petkovski@finki.mk"</td> <td>7-8</td>
  </tr>
  <tr>
    <td>FX</td> <td>user.getEmail()=="sergej.petkovskifinki.mk"</td> <td>7-4.3</td>
  </tr>
  <tr>
    <td>TF</td> <td>user.getEmail()=="sergej.petkovski@finkimk"</td> <td>7-4.3</td>
  </tr>
</table>
<br>

Condition 3: 
<br>
<b>if (atChar && dotChar)</b>
<table>
  <tr>
  <th>Combination</th>
    <th>Test case</th>
    <th>Branch</th>
  </tr>
  <tr>
    <td>TT</td> <td>user.getEmail()=="sergej.petkovski@finki.mk"</td> <td>9-10</td>
  </tr>
  <tr>
    <td>FX</td> <td>user.getEmail()=="sergej.petkovskifinki.mk"</td> <td>9-11</td>
  </tr>
  <tr>
    <td>TF</td> <td>user.getEmail()=="sergej.petkovski@finkimk"</td> <td>9-11</td>
  </tr>
</table>

### Тест случаи според критериумот Every branch
<br>
<table>
  <tr>
    <th>Test case</th>
    <th>Branch</th>
  </tr>
  <tr>
    <td>user == null</td> <td>1-11</td> 
  </tr>
  <tr>
    <td>user.getUsername()=="sergej" && user.getEmail()=="sergej.petkovski@finki.mk" && !allUsers.contains(user.getUsername()) </td> <td>1-2, 2-3, 3-4.1, 4.1-4.2, 4.2-5, 5-6, 6-7, 7-8, 7-4.3, 8-4.3, 5-7, 4.3-4.2, 4.2-9, 9-10</td> 
  </tr>
  <tr>
    <td>user.getUsername() == null</td> <td>1-2, 2-11</td>
  </tr>
  <tr>
    <td>user.getEmail()=="sergej.petkovski@finkimk"</td> <td>1-2, 2-3, 3-4.1, 4.1-4.2, 4.2-5, 5-6, 6-7, 7-8, 7-4.3, 8-4.3, 5-7, 4.3-4.2, 4.2-9, 9-11</td>
  </tr>
</table>




### Објаснување на напишаните unit tests




<b>Multiple condition</b>
<br>
<i>if (user.getUsername()!=null && user.getEmail()!=null && !allUsers.contains(user.getUsername()))</i><br>
Тестови за услов 1:
<br>
1. Потребно е сите три проверки да бидат точни. Во овој случај функцијата враќа true. 
2. Првата проверка е false, другите не се проверуваат. Функцијата враќа false.
3. Првата проверка е true, втората е false, другите не се проверуваат. Функцијата враќа false.
4. Првата проверка е true, втората е true, третата е false. Функцијата враќа false.

<br>
<i>if (atChar && user.getEmail().charAt(i)=='.')</i> <i>if (atChar && dotChar)</i>
<br>
Тестови за услов 2 и 3:
<br> 
1. Потребно е двете претпоставки да бидат точни. Во овој случај функцијата враќа true.<br>
2. Првата проверка е false, втората не се проверува. Функцијата враќа false.<br>
3. Првата проверка е true, втората е false. Функцијата враќа false.<br>

<br>
<b>Every branch</b>
<br>
1. За да се помине гранката од 1-11 user треба да биде null. Функцијата враќа false. <br>
2. За да се поминат гранките од 1-2, 2-3, 3-4.1, 4.1-4.2, 4.2-5, 5-6, 6-7, 7-8, 7-4.3, 8-4.3, 5-7, 4.3-4.2, 4.2-9, 9-10 сите податоци треба да бидата легитимни. Функцијата враќа true. <br>
3. Ќе се поминат гранките 1-2, 2-11 кога во вториот услов барем една проверка нема да е точна. Функцијата враќа false. <br>
4. Ќе се поминат гранките 1-2, 2-3, 3-4.1, 4.1-4.2, 4.2-5, 5-6, 6-7, 7-8, 7-4.3, 8-4.3, 5-7, 4.3-4.2, 4.2-9, 9-11 кога меилот не е валиден. Функцијата ќе врати false.
<br>

