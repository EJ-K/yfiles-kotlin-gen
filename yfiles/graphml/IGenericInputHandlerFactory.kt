// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Interface for factory classes for [IInputHandler] creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGenericInputHandlerFactory">Online Documentation</a>
 */
external interface IGenericInputHandlerFactory : YObject {
/**
 * Create an [IInputHandler] instance based on the given `event`.
 * @param [keyType] The key type as inferred by the caller from the GraphML contents.
 * @param [valueType] The type of the value as inferred by the caller from the GraphML contents.
 * @param [event] The event argument that is used like in [GraphMLIOHandler.QueryInputHandlers]
 * @return The specific input handler to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGenericInputHandlerFactory%23IGenericInputHandlerFactory-method-createInputHandler">Online Documentation</a>
 */
   fun createInputHandler( keyType: YClass<*> ,
 valueType: YClass<*> ,
 event: QueryInputHandlersEventArgs ):IInputHandler?

companion object : InterfaceMetadata<IGenericInputHandlerFactory> {

/**
 * Creates an implementation of the interface [IGenericInputHandlerFactory] by using the given function as implementation for its [createInputHandler] method.
 * @param [createInputHandler] A function for [IGenericInputHandlerFactory]'s single abstract method [createInputHandler].
 * @return An instance of the [IGenericInputHandlerFactory] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGenericInputHandlerFactory%23IGenericInputHandlerFactory-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                createInputHandler: (
            keyType: YClass<*>,
valueType: YClass<*>,
event: QueryInputHandlersEventArgs
            ) -> IInputHandler 
            ):IGenericInputHandlerFactory
}
}
