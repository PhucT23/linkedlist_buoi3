Giải thích tại sao khi a dùng 
for (int i = 0; i <= index; i++) {
            temp = temp.next;
        } 
thì temp nó là node tại vị trí index

-----Trả lời: temp = temp.next sẽ dùng để tìm ra node cuối cùng của mảng và điều kiện ở trong vòng lặp for là i <= index, cho nên khi biến i chạy đến vị trí cuối cùng thì nó cũng là tại vị trí i = index trong mảng.

còn nếu anh dùng ntn:
for (int i = 0; i < index; i++) {
            temp = temp.next;
        } 
thì temp nó là node trước vị trí index

-----Trả lời: temp = temp.next cũng dùng để tìm ra node cuối cùng của mảng , tại vì điều kiện trong lặp for là i < index nên i chạy tới vị trí cuối cùng của mảng, và do điều kiện của lặp for nên là vị trí cuối cùng sẽ là vị trí trước index, vì i < index.


-------

1 -> 2 -> 3 -> 4 -> 5

Good luck cac em !!!
     ---        ---
   -------   --------
  -------------------
    ---------------
      -----------
        ------- 
          ---
           -
