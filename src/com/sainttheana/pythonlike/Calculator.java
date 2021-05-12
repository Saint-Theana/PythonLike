package com.sainttheana.pythonlike;

public class Calculator
{
	public static Object calculateNumberPlus(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
			{
				return ((Integer)a) + ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Integer)a) + ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Integer)a) + ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Integer)a) + ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Integer)a) + ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Integer)a) + ((Double)b);
			} 
		}
		else if (a instanceof Long)
		{
			if (b instanceof Integer)
			{
				return ((Long)a) + ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Long)a) + ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Long)a) + ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Long)a) + ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Long)a) + ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Long)a) + ((Double)b);
			} 
		}
		else if (a instanceof Short)
		{
			if (b instanceof Integer)
			{
				return ((Short)a) + ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Short)a) + ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Short)a) + ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Short)a) + ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Short)a) + ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Short)a) + ((Double)b);
			} 
		}
		else if (a instanceof Byte)
		{
			if (b instanceof Integer)
			{
				return ((Byte)a) + ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Byte)a) + ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Byte)a) + ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Byte)a) + ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Byte)a) + ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Byte)a) + ((Double)b);
			} 
		}
		else if (a instanceof Float)
		{
			if (b instanceof Integer)
			{
				return ((Float)a) + ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Float)a) + ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Float)a) + ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Float)a) + ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Float)a) + ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Float)a) + ((Double)b);
			} 
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
			{
				return ((Double)a) + ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Double)a) + ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Double)a) + ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Double)a) + ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Double)a) + ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Double)a) + ((Double)b);
			} 
		} 
		return null;
	}

	public static Object calculateNumberReduce(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
			{
				return ((Integer)a) - ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Integer)a) - ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Integer)a) - ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Integer)a) - ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Integer)a) - ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Integer)a) - ((Double)b);
			} 
		}
		else if (a instanceof Long)
		{
			if (b instanceof Integer)
			{
				return ((Long)a) - ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Long)a) - ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Long)a) - ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Long)a) - ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Long)a) - ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Long)a) - ((Double)b);
			} 
		}
		else if (a instanceof Short)
		{
			if (b instanceof Integer)
			{
				return ((Short)a) - ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Short)a) - ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Short)a) - ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Short)a) - ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Short)a) - ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Short)a) - ((Double)b);
			} 
		}
		else if (a instanceof Byte)
		{
			if (b instanceof Integer)
			{
				return ((Byte)a) - ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Byte)a) - ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Byte)a) - ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Byte)a) - ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Byte)a) - ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Byte)a) - ((Double)b);
			} 
		}
		else if (a instanceof Float)
		{
			if (b instanceof Integer)
			{
				return ((Float)a) - ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Float)a) - ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Float)a) - ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Float)a) - ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Float)a) - ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Float)a) - ((Double)b);
			} 
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
			{
				return ((Double)a) - ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Double)a) - ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Double)a) - ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Double)a) - ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Double)a) - ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Double)a) - ((Double)b);
			} 
		} 
		throw new UnsupportedOperationException();
	}

	public static Object calculateNumberDiv(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
			{
				return ((Integer)a) / ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Integer)a) / ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Integer)a) / ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Integer)a) / ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Integer)a) / ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Integer)a) / ((Double)b);
			} 
		}
		else if (a instanceof Long)
		{
			if (b instanceof Integer)
			{
				return ((Long)a) / ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Long)a) / ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Long)a) / ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Long)a) / ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Long)a) / ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Long)a) / ((Double)b);
			} 
		}
		else if (a instanceof Short)
		{
			if (b instanceof Integer)
			{
				return ((Short)a) / ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Short)a) / ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Short)a) / ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Short)a) / ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Short)a) / ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Short)a) / ((Double)b);
			} 
		}
		else if (a instanceof Byte)
		{
			if (b instanceof Integer)
			{
				return ((Byte)a) / ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Byte)a) / ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Byte)a) / ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Byte)a) / ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Byte)a) / ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Byte)a) / ((Double)b);
			} 
		}
		else if (a instanceof Float)
		{
			if (b instanceof Integer)
			{
				return ((Float)a) / ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Float)a) / ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Float)a) / ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Float)a) / ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Float)a) / ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Float)a) / ((Double)b);
			} 
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
			{
				return ((Double)a) / ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Double)a) / ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Double)a) / ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Double)a) / ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Double)a) / ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Double)a) / ((Double)b);
			} 
		} 
		throw new UnsupportedOperationException();
	}

	public static Object calculateNumberMul(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
			{
				return ((Integer)a) * ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Integer)a) * ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Integer)a) * ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Integer)a) * ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Integer)a) * ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Integer)a) * ((Double)b);
			} 
		}
		else if (a instanceof Long)
		{
			if (b instanceof Integer)
			{
				return ((Long)a) * ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Long)a) * ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Long)a) * ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Long)a) * ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Long)a) * ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Long)a) * ((Double)b);
			} 
		}
		else if (a instanceof Short)
		{
			if (b instanceof Integer)
			{
				return ((Short)a) * ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Short)a) * ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Short)a) * ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Short)a) * ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Short)a) * ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Short)a) * ((Double)b);
			} 
		}
		else if (a instanceof Byte)
		{
			if (b instanceof Integer)
			{
				return ((Byte)a) * ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Byte)a) * ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Byte)a) * ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Byte)a) * ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Byte)a) * ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Byte)a) * ((Double)b);
			} 
		}
		else if (a instanceof Float)
		{
			if (b instanceof Integer)
			{
				return ((Float)a) * ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Float)a) * ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Float)a) * ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Float)a) * ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Float)a) * ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Float)a) * ((Double)b);
			} 
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
			{
				return ((Double)a) * ((Integer)b);
			}
			else if (b instanceof Long)
			{
				return ((Double)a) * ((Long)b);
			}
			else if (b instanceof Short)
			{
				return ((Double)a) * ((Short)b);
			}
			else if (b instanceof Byte)
			{
				return ((Double)a) * ((Byte)b);
			}
			else if (b instanceof Float)
			{
				return ((Double)a) * ((Float)b);
			}
			else if (b instanceof Double)
			{
				return ((Double)a) * ((Double)b);
			} 
		} 
		throw new UnsupportedOperationException();
	}
}
