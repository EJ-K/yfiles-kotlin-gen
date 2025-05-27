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
 * Defines an event which is dispatched when a property changes its value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPropertyObservable">Online Documentation</a>
 */
external interface IPropertyObservable : IEventDispatcher {

  
  companion object : InterfaceMetadata<IPropertyObservable> {
  }
}

/**
 * `property-changed`: Occurs when a property changes of this instance changed its value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPropertyObservable%23property-changed">Online Documentation</a>
 */
inline fun  IPropertyObservable.addPropertyChangedHandler(
  crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
  val listener: PropertyChangedEventHandler = { event, _ -> handler(event.propertyName) }
  addEventListener("property-changed", listener)
  return { removeEventListener("property-changed", listener) }
}
