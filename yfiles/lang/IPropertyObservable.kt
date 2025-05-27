// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.lang

/**
 * Defines an event which is dispatched when a property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPropertyObservable">Online Documentation</a>
 */
external interface IPropertyObservable : YObject, IEventDispatcher {
/**
 * Occurs when a property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPropertyObservable%23PropertyChanged">Online Documentation</a>
 */
fun addPropertyChangedListener(listener: PropertyChangedEventHandler)
fun removePropertyChangedListener(listener: PropertyChangedEventHandler)

companion object : InterfaceMetadata<IPropertyObservable> {
}
}

/**
 * Occurs when a property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPropertyObservable%23PropertyChanged">Online Documentation</a>
 */
inline fun  IPropertyObservable.addPropertyChangedHandler(
    crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
    val listener: PropertyChangedEventHandler = { _, event -> handler(event.propertyName) }
    addPropertyChangedListener(listener)
    return { removePropertyChangedListener(listener) }
}
