def devide(m,n):
    try:
        result = m/n
    except ZeroDivisionError:
        print("0으로 나눌 수 없습니다.")
    except:
        print ("그 이외의 에러")
    else:
        return result
    finally:
        print("나눗셈 연산이었습니다.")

if __name__ == "__main__":
    res=devide(5,3)
    print(res)

    res=devide(10,0)
    print(res)