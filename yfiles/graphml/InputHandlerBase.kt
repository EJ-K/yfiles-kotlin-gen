// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import web.dom.Element
import web.dom.Node
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass

/**
 * An abstract base implementation of the [IInputHandler] interface.
 * @param [TKey] The type of the key, i.e. the items that are associated with the data in the GraphML.
 * @param [TData] The type of the data that is associated with the keys.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [InputHandlerBase] class.
 * @param [keyType] The type of the key, i.e. the items that are associated with the data in the GraphML.
 * @param [dataType] The type of the data that is associated with the keys.
 * @param [precedence] The precedence to assign to the [precedence] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase%23InputHandlerBase-constructor-InputHandlerBase(yfiles.lang.Class,yfiles.lang.Class,ParsePrecedence)">Online Documentation</a>
 * 
 * @property precedence
 * Gets or sets the parse precedence that is associated with this handler.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase%23precedence">Online Documentation</a>
 */
external abstract class InputHandlerBase<TKey : Any, TData : Any> 
protected constructor (
 keyType: YClass<TKey> ,
 dataType: YClass<TData> ,
final override var precedence: ParsePrecedence = definedExternally) : IInputHandler {

/**
 * Gets a value indicating whether a default value has been set, either through a key definition element or explicitly by assigning a value to the [defaultValue] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase%23defaultExists">Online Documentation</a>
 */
final val defaultExists: Boolean
/**
 * Gets or sets the default value that will be applied to the keys where the data attribute is missing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase%23defaultValue">Online Documentation</a>
 */
final var defaultValue: TData?
/**
 * Gets or sets a value indicating whether the default value in the key definition should be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase%23parseDefaultValue">Online Documentation</a>
 */
final var parseDefaultValue: Boolean
/**
 * This method is invoked when no data tag is defined, and the default value should be applied.
 * @param [context] the current parse context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase%23InputHandlerBase-method-applyDefault">Online Documentation</a>
 */
 override   fun applyDefault( context: IParseContext )
/**
 * Initializes this instance from the GraphML key definition.
 * @param [context] The context.
 * @param [definition] The definition.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase%23InputHandlerBase-method-initializeFromKeyDefinition">Online Documentation</a>
 */
 open   fun initializeFromKeyDefinition( context: IParseContext ,
 definition: Element )
/**
 * This method is invoked each time a data element with matching key is processed.
 * @param [context] the current parse context.
 * @param [node] the DOM node representing the data element.
 * @see [CreationProperties]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase%23InputHandlerBase-method-parseData">Online Documentation</a>
 */
 override   fun parseData( context: IParseContext ,
 node: Node )
/**
 * Abstract method callback that actually parses the data.
 * @param [context] The context.
 * @param [node] The node that contains the data. This is either the GraphML 'data' element or the 'default' element.
 * @return The parsed data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase%23InputHandlerBase-method-parseDataCore">Online Documentation</a>
 */
 abstract protected   fun parseDataCore( context: IParseContext ,
 node: Node ):TData?
/**
 * Abstract method callback that actually stores the value with the keys.
 * @param [context] The context.
 * @param [key] The key.
 * @param [data] The data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputHandlerBase%23InputHandlerBase-method-setValue">Online Documentation</a>
 */
 abstract protected   fun setValue( context: IParseContext ,
 key: TKey? ,
 data: TData? )

companion object : ClassMetadata<InputHandlerBase<*, *>> {
}
}
