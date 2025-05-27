// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.graph

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun <T> Any.observable(initialValue: T): ReadWriteProperty<Any, T> {
    return Property(initialValue)
}

interface IPropertyProvider<P:Any, T:Any> {
    operator fun provideDelegate(
        thisRef: P,
        property: KProperty<*>
    ): ReadOnlyProperty<P, T>
}

private class TagPropertyProvider<T:Any>(
    private val value: T
): IPropertyProvider<Tag, T> {
    override operator fun provideDelegate(
        thisRef: Tag,
        property: KProperty<*>
    ): ReadOnlyProperty<Tag, T> {
        val propertyName = property.name
        value.asDynamic().firePropertyChanged = { 
            thisRef.firePropertyChanged(propertyName)
        }
        
        return Constant(value)
    }
}

private class Constant<P:Any, T:Any>(
    private val value: T
) : ReadOnlyProperty<P, T> {
    override fun getValue(
        thisRef: P,
        property: KProperty<*>
    ): T =
        value
}

private class Property<P:Any, T>(
    initialValue: T
) : ReadWriteProperty<P, T> {
    private var value: T = initialValue

    override fun getValue(
        thisRef: P,
        property: KProperty<*>
    ): T =
        value

    override fun setValue(
        thisRef: P,
        property: KProperty<*>,
        value: T
    ) {
        if (this.value != value) {
            this.value = value
            thisRef.firePropertyChanged(property.name)
        }
    }
}
 
private fun Any.firePropertyChanged(propertyName: String) {
    asDynamic().firePropertyChanged(propertyName)
}

private inline val Any.firePropertyChangedDeclared: Boolean
    get() = !!asDynamic().firePropertyChanged
