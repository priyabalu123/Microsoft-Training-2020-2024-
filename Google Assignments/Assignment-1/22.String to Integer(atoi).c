
            break;

        char nextChar = str[i+1];
        if (nextChar == '\0')
            return 0;
        
        else if (c == '.' && isdigit(nextChar))
        {
            return 0;
        }
        else if (c == '+' || c == '-')
        {
            if (!isdigit(nextChar))
                return 0;
            i++;
            
            if (c == '-')
                neg = true;
            
            break;
        }
        else if (isalpha(c))
            return 0;
                
        c = str[++i];
    }
    
    int res = 0;
    printf("i=%d c=%c\n", i, str[i]);
    while(isdigit(str[i]))
    {
        int d = str[i] - '0';
        
        if (neg)
            d = -d;
        
        if (res > INT_MAX/10 || (res == INT_MAX/10 && d > 7))
            return INT_MAX;
        
        if (res < INT_MIN/10 || (res == INT_MIN/10 && d < -8))
            return INT_MIN;
        
        res = res*10 + d;
        
        i++;
    }
    
    return res;
    
}
