// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import js.promise.Promise
import web.dom.Document
import web.dom.Element
import web.dom.Node
import yfiles.collections.IList
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Core parser class for GraphML.
 * @see [GraphMLIOHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-constructor-GraphMLParser">Online Documentation</a>
 */
external open class GraphMLParser  () : YObject, IEventDispatcher {

/**
 * Create the initial [IParseContext] instance.
 * @param [graph] The graph that is parsed.
 * @return An [IParseContext] instance that is suitable for `graph`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-createParseContext">Online Documentation</a>
 */
 open protected   fun createParseContext( graph: IGraph ):IParseContext
/**
 * Deserialize the content of `element`.
 * @param [T] The desired type of the result.
 * @param [targetType] The desired type of the result.
 * @param [context] The current parse context.
 * @param [element] The XML content that should be deserialized.
 * @return An instance of `T` that is represented by `element`.
 * @see [IParseContext.deserializeCore]
 * @see [addHandleDeserializationListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-deserialize">Online Documentation</a>
 */
 open   fun <T : Any>deserialize( targetType: YClass<T> ,
 context: IParseContext ,
 element: Node ):T?
/**
 * Retrieve a deserialization property that has been set by [setDeserializationProperty].
 * @param [key] The key for the property.
 * @see [IParseContext.getDeserializationProperty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-getDeserializationProperty">Online Documentation</a>
 */
 open   fun <T : Any>getDeserializationProperty( key: SerializationPropertyKey<T> ):T?
/**
 * Dynamically retrieve all [IInputHandler] instances that process a GraphML attribute with key definition `keyDefinition`.
 * @param [context] The current parse context.
 * @param [keyDefinition] The key definition element of the GraphML attribute.
 * @return A list of [IInputHandlers][IInputHandler] that claim to be responsible for handling the given GraphML attribute.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-getInputHandlers">Online Documentation</a>
 */
 open   fun getInputHandlers( context: IParseContext ,
 keyDefinition: Element ):IList<out IInputHandler>
/**
 * Dynamically retrieve an instance of `type`.
 * @param [type] The type for which an implementation is needed.
 * @return An implementation of `type`, or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-lookup">Online Documentation</a>
 */
 open   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Fires the [HandleDeserialization] event.
 * @param [event] The arguments that get passed to the [HandleDeserialization] event.
 * @see [GraphMLIOHandler.onHandleDeserialization]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-onHandleDeserialization">Online Documentation</a>
 */
 open protected   fun onHandleDeserialization( event: HandleDeserializationEventArgs )
/**
 * Raises the [Parsed] event.
 * @param [event] The [ParseEventArgs] instance containing the event data.
 * @see [addParsedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-onParsed">Online Documentation</a>
 */
 open protected   fun onParsed( event: ParseEventArgs )
/**
 * Raises the [Parsing] event.
 * @param [event] The [ParseEventArgs] instance containing the event data.
 * @see [addParsingListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-onParsing">Online Documentation</a>
 */
 open protected   fun onParsing( event: ParseEventArgs )
/**
 * Fires the [QueryInputHandlers] event.
 * @param [event] The arguments that get passed to the [QueryInputHandlers] event.
 * @see [GraphMLIOHandler.onQueryInputHandlers]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-onQueryInputHandlers">Online Documentation</a>
 */
 open protected   fun onQueryInputHandlers( event: QueryInputHandlersEventArgs )
/**
 * Parse the XML document `document` into an `graph` instance, using `elementFactory` to create the elements.
 * @param [graph] The graph instance that is populated.
 * @param [document] The XML document instance to parse. **Note**: If you are using Internet Explorer 9 and [XMLHttpRequest]s to retrieve the document, you may not use the value from the [XMLHttpRequest.responseXML] property. Please parse [XMLHttpRequest.responseText] instead and use the result. For further reference see <a href="https://docs.microsoft.com/en-us/previous-versions/windows/internet-explorer/ie-developer/compatibility/hh180177(v=vs.85)">https://docs.microsoft.com/en-us/previous-versions/windows/internet-explorer/ie-developer/compatibility/hh180177(v=vs.85)</a>.
 * @param [elementFactory] The [IGraphElementFactory] instance that is used to create the elements.
 * @see [GraphMLIOHandler.readFromDocument]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-parseFromDocument">Online Documentation</a>
 */
 open   fun parseFromDocument( graph: IGraph ,
 document: Document ,
 elementFactory: IGraphElementFactory ):Promise<IGraph>
/**
 * Parse the input `url` into an `graph` instance, using `elementFactory` to create the elements.
 * @param [graph] The graph instance that is populated.
 * @param [url] The URL to the input to parse.
 * @param [elementFactory] The [IGraphElementFactory] instance that is used to create the elements.
 * @see [GraphMLIOHandler.readFromGraphMLText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-parseFromURL">Online Documentation</a>
 */
 open   fun parseFromURL( graph: IGraph ,
 url: String ,
 elementFactory: IGraphElementFactory ):Promise<IGraph>
/**
 * Remove a deserialization property that has been set by [setDeserializationProperty].
 * @param [key] The key for the property.
 * @see [IParseContext.getDeserializationProperty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-removeDeserializationProperty">Online Documentation</a>
 */
 open   fun removeDeserializationProperty( key: SerializationPropertyKey<*> )
/**
 * Remove an implementation of `T` that has been set with [setLookup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-removeLookup">Online Documentation</a>
 */
 open   fun removeLookup( tType: YClass<*> )
/**
 * Set a deserialization property that allows to fine tune the parsing process.
 * @param [key] The key for the property.
 * @param [value] The property value.
 * @see [IParseContext.getDeserializationProperty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-setDeserializationProperty">Online Documentation</a>
 */
 open   fun <T : Any>setDeserializationProperty( key: SerializationPropertyKey<T> ,
 value: T? )
/**
 * Register an implementation of `T` for use with [lookup].
 * @param [T] The type of `instance`.
 * @param [tType] The type of `instance`.
 * @param [instance] The implementation of `T` for lookup retrieval.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23GraphMLParser-method-setLookup">Online Documentation</a>
 */
 open   fun <T : Any>setLookup( tType: YClass<T> ,
 instance: T? )
/**
 * Occurs when [IInputHandler]s are queried.
 * @see [GraphMLIOHandler.addQueryInputHandlersListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23QueryInputHandlers">Online Documentation</a>
 */
fun addQueryInputHandlersListener(listener: EventHandler1<QueryInputHandlersEventArgs>)
fun removeQueryInputHandlersListener(listener: EventHandler1<QueryInputHandlersEventArgs>)

/**
 * Occurs when XML content is about to be deserialized.
 * @see [GraphMLIOHandler.addHandleDeserializationListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23HandleDeserialization">Online Documentation</a>
 */
fun addHandleDeserializationListener(listener: EventHandler1<HandleDeserializationEventArgs>)
fun removeHandleDeserializationListener(listener: EventHandler1<HandleDeserializationEventArgs>)

/**
 * Occurs when the document has been parsed.
 * @see [onParsed]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23Parsed">Online Documentation</a>
 */
fun addParsedListener(listener: EventHandler1<ParseEventArgs>)
fun removeParsedListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when the parsing of the document is just about to begin.
 * @see [onParsing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23Parsing">Online Documentation</a>
 */
fun addParsingListener(listener: EventHandler1<ParseEventArgs>)
fun removeParsingListener(listener: EventHandler1<ParseEventArgs>)

companion object : ClassMetadata<GraphMLParser> {
}
}

/**
 * Occurs when [IInputHandler]s are queried.
 * @see [GraphMLIOHandler.addQueryInputHandlersListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23QueryInputHandlers">Online Documentation</a>
 */
inline fun  GraphMLParser.addQueryInputHandlersHandler(
    crossinline handler: (event:QueryInputHandlersEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryInputHandlersEventArgs> = { _, event -> handler(event) }
    addQueryInputHandlersListener(listener)
    return { removeQueryInputHandlersListener(listener) }
}
/**
 * Occurs when XML content is about to be deserialized.
 * @see [GraphMLIOHandler.addHandleDeserializationListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23HandleDeserialization">Online Documentation</a>
 */
inline fun  GraphMLParser.addHandleDeserializationHandler(
    crossinline handler: (event:HandleDeserializationEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<HandleDeserializationEventArgs> = { _, event -> handler(event) }
    addHandleDeserializationListener(listener)
    return { removeHandleDeserializationListener(listener) }
}
/**
 * Occurs when the document has been parsed.
 * @see [onParsed]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23Parsed">Online Documentation</a>
 */
inline fun  GraphMLParser.addParsedHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addParsedListener(listener)
    return { removeParsedListener(listener) }
}
/**
 * Occurs when the parsing of the document is just about to begin.
 * @see [onParsing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParser%23Parsing">Online Documentation</a>
 */
inline fun  GraphMLParser.addParsingHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addParsingListener(listener)
    return { removeParsingListener(listener) }
}
