// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.lang

            private const val YCLASS = "\$class"
            
            external interface IClassMetadata<T: Any> {
               @JsName(YCLASS)
               val yclass:YClass<T>   
            }
            
            inline val <T: YObject> JsClass<T>.yclass:YClass<T>
                get() = unsafeCast<IClassMetadata<T>>().yclass
            
            internal fun <T: Any> JsClass<T>.findClass():YClass<T>? =
                asDynamic()[YCLASS] as? YClass<T>
            
            inline val Boolean.Companion.yclass: YClass<Boolean>
    get() = __BOOLEAN__.unsafeCast<IClassMetadata<Boolean>>().yclass

inline val Double.Companion.yclass: YClass<Double>
    get() = __NUMBER__.unsafeCast<IClassMetadata<Double>>().yclass

inline val Int.Companion.yclass: YClass<Int>
    get() = __NUMBER__.unsafeCast<IClassMetadata<Int>>().yclass

inline val String.Companion.yclass: YClass<String>
    get() = __STRING__.unsafeCast<IClassMetadata<String>>().yclass    
