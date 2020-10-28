# say_young

##### MainActivity.kt

```kotlin
private fun setDoubleClick() {
        button_double_click.setOnClickListener {
            doubleClickFlag++
            val handler = Handler()
            val clickRunnable = Runnable {
                doubleClickFlag = 0
                //todo 클릭 이벤트
            }
            if (doubleClickFlag == 1) {
                handler.postDelayed(clickRunnable, CLICK_DELAY)
            }
            else if (doubleClickFlag == 2) {
                doubleClickFlag = 0
                //todo 더블클릭 이벤트
                if (flag == 0) {
                    button_1.isPressed = true
                    flag = 1
                }
                else if (flag == 1) {
                    button_1.isPressed = false
                    flag = 0
                }
                Log.d("doubleclicktest", "test")
            }
        }
    }
```

<br>

> ### setDoubleClick()
  - 더블 클릭 이벤트 발생 시, table layout의 첫 번째 원소가 선택되도록 하는 함수입니다.
  - todo 주석 부분에 더블 클릭 시 이루어질 행동을 정의해주면 됩니다!
  - 임시로 설정된 button_double_click 대신 더블 클릭할 카드의 id에 OnClickListener를 부착해주면 됩니다.

<br>

#### activity_main.xml

```kotlin
<TableLayout
        android:id="@+id/tablelayout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginHorizontal="20dp"
        android:layout_marginTop="20dp"
        android:background="#D35454"
        android:padding="2dp"
        android:stretchColumns="*"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:clickable="true">

        <TableRow android:background="#D35454">
            <Button
                android:id="@+id/button_1"
                android:text="1"
                android:textColor="@drawable/selector_button_text"
                android:layout_width="50dp"
                android:layout_height="match_parent"
                android:background="@drawable/selector_button_pressed"
                android:layout_margin="1dp"/>
            <Button
                android:id="@+id/button_2"
                android:text="2"
                android:textColor="@drawable/selector_button_text"
                android:layout_width="50dp"
                android:layout_height="match_parent"
                android:background="@drawable/selector_button_pressed"
                android:layout_margin="1dp"/>
            <Button
                android:id="@+id/button_3"
                android:text="3"
                android:textColor="@drawable/selector_button_text"
                android:layout_width="50dp"
                android:layout_height="match_parent"
                android:background="@drawable/selector_button_pressed"
                android:layout_margin="1dp"/>
            <Button
                android:id="@+id/button_4"
                android:text="4"
                android:textColor="@drawable/selector_button_text"
                android:layout_width="50dp"
                android:layout_height="match_parent"
                android:background="@drawable/selector_button_pressed"
                android:layout_margin="1dp"/>
            <Button
                android:id="@+id/button_5"
                android:text="5"
                android:textColor="@drawable/selector_button_text"
                android:layout_width="50dp"
                android:layout_height="match_parent"
                android:background="@drawable/selector_button_pressed"
                android:layout_margin="1dp"/>
            <Button
                android:id="@+id/button_6"
                android:text="6"
                android:textColor="@drawable/selector_button_text"
                android:layout_width="50dp"
                android:layout_height="match_parent"
                android:background="@drawable/selector_button_pressed"
                android:layout_margin="1dp"/>
            <Button
                android:id="@+id/button_7"
                android:text="7"
                android:textColor="@drawable/selector_button_text"
                android:layout_width="50dp"
                android:layout_height="match_parent"
                android:background="@drawable/selector_button_pressed"
                android:layout_marginVertical="1dp"
                android:layout_marginLeft="1dp"/>
        </TableRow>
    </TableLayout>
```

<br>

> ### TableLayout
  - 세영이가 준 디자인을 보고 문득 tableLayout이 떠올라 한 번 시도해봤습니다.
  - tableLayout 각각의 원소로 Button을 넣어줬습니다!
  - 하지만 만들다보니 생각보다 tableLayout이 까다롭더라고요 ... 
  - 다른 좋은 아이디어가 있다면 tableLayout 대신 시도해봐도 좋을 것 같습니다!
  
<br>

#### selector_button_pressed.xml

```kotlin
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_pressed="true">
        <shape>
            <solid android:color="#D35454"/>
        </shape>
    </item>
    <item android:state_pressed="false">
        <shape>
            <solid android:color="#FFFFFF"/>
        </shape>
    </item>
</selector>
```

<br>

> ### button의 눌림 효과 custom
  - 버튼이 눌렸을 때는 숫자 주위에 빨간 동그라미가, 눌리지 않았을 때는 하얀 배경색이 나타나도록 커스텀했습니다.
  - 눌렸을 때 버튼의 background에 빨간 동그라미가 나타나도록 하려면, radius 속성을 상하좌우에 적절히 주면 될 것 같습니다!
  (하지만 tableLayout의 테두리를 만들기 위해 적용한 배경색 때문에, radius 속성을 넣어도 보여지지 않아 우선 빼놓았습니다 T___T)
  

<br>

#### 세영이의 A+을 위하여 ... 세영이 파이팅 !!!!!
