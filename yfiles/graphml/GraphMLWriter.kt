// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.collections.IEnumerable
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Core writer class for GraphML.
 * @see [GraphMLIOHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-constructor-GraphMLWriter">Online Documentation</a>
 */
external open class GraphMLWriter  () : YObject, IEventDispatcher {

/**
 * Gets the events in the internal [IWriteEvents] implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23writeEvents">Online Documentation</a>
 */
final val writeEvents: IWriteEvents
/**
 * Create the initial [IWriteContext] instance.
 * @param [graph] The graph that is written.
 * @param [writer] The core [IXmlWriter] instance that does the actual writing of XML content.
 * @return An [IWriteContext] instance that is suitable for `graph`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-createWriteContext">Online Documentation</a>
 */
 open protected   fun createWriteContext( graph: IGraph ,
 writer: IXmlWriter ):IWriteContext
/**
 * Dynamically retrieve all [IOutputHandler] that should be used for the current write process.
 * @param [context] The current write context.
 * @param [scope] The scope to get output handlers for.
 * @return A dictionary from handler definition ids to [IOutputHandlers][IOutputHandler].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-getOutputHandlers">Online Documentation</a>
 */
 open   fun getOutputHandlers( context: IWriteContext ,
 scope: KeyScope ):IEnumerable<IOutputHandler>
/**
 * Retrieve a serialization property that has been set by [setSerializationProperty].
 * @param [key] The key for the property.
 * @see [IWriteContext.getSerializationProperty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-getSerializationProperty">Online Documentation</a>
 */
 open   fun <T : Any>getSerializationProperty( key: SerializationPropertyKey<T> ):T?
/**
 * Dynamically retrieve an instance of `type`.
 * @param [type] The type for which an implementation is needed.
 * @return An implementation of `type`, or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-lookup">Online Documentation</a>
 */
 open protected   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Fires the [HandleSerialization] event.
 * @param [event] The arguments that get passed to the [HandleSerialization] event.
 * @see [GraphMLIOHandler.onHandleSerialization]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-onHandleSerialization">Online Documentation</a>
 */
 open protected   fun onHandleSerialization( event: HandleSerializationEventArgs )
/**
 * Fires the [QueryOutputHandlers] event.
 * @param [event] The arguments that get passed to the [QueryOutputHandlers] event.
 * @see [GraphMLIOHandler.onQueryOutputHandlers]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-onQueryOutputHandlers">Online Documentation</a>
 */
 open protected   fun onQueryOutputHandlers( event: QueryOutputHandlersEventArgs )
/**
 * Fires the [QueryReferenceId] event.
 * @param [event] The arguments that get passed to the [QueryReferenceId] event.
 * @see [GraphMLIOHandler.onQueryReferenceId]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-onQueryReferenceId">Online Documentation</a>
 */
 open protected   fun onQueryReferenceId( event: QueryReferenceIdEventArgs )
/**
 * Raises the [Writing] event.
 * @param [event] The [WriteEventArgs] instance containing the event data.
 * @see [addWritingListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-onWriting">Online Documentation</a>
 */
 open protected   fun onWriting( event: WriteEventArgs )
/**
 * Raises the [Written] event.
 * @param [event] The [WriteEventArgs] instance containing the event data.
 * @see [addWrittenListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-onWritten">Online Documentation</a>
 */
 open protected   fun onWritten( event: WriteEventArgs )
/**
 * Remove an implementation of `T` that has been set with [setLookup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-removeLookup">Online Documentation</a>
 */
 open   fun removeLookup( tType: YClass<*> )
/**
 * Remove a serialization property that has been set by [setSerializationProperty].
 * @param [key] The key for the property.
 * @see [IWriteContext.getSerializationProperty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-removeSerializationProperty">Online Documentation</a>
 */
 open   fun removeSerializationProperty( key: SerializationPropertyKey<*> )
/**
 * Serialize `item`.
 * @param [T] The desired type of the result.
 * @param [targetType] The desired type of the result.
 * @param [context] The current parse context.
 * @param [item] The object that should be serialized.
 * @throws SerializationNotSupportedError `SerializationNotSupportedException` if `item` cannot be serialized.
 * @see [IWriteContext.serializeCore]
 * @see [addHandleSerializationListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-serialize">Online Documentation</a>
 */
 open protected   fun <T : Any>serialize( targetType: YClass<T> ,
 context: IWriteContext ,
 item: T? )
/**
 * Register an implementation of `T` for use with [lookup].
 * @param [T] The type of `instance`.
 * @param [tType] The type of `instance`.
 * @param [instance] The implementation of `T` for lookup retrieval.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-setLookup">Online Documentation</a>
 */
 open   fun <T : Any>setLookup( tType: YClass<T> ,
 instance: T? )
/**
 * Set a serialization property that allows to fine tune the write process.
 * @param [key] The key for the property.
 * @param [value] The property value.
 * @see [IWriteContext.getSerializationProperty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-setSerializationProperty">Online Documentation</a>
 */
 open   fun <T : Any>setSerializationProperty( key: SerializationPropertyKey<T> ,
 value: T? )
/**
 * Write the GraphML representation of `graph`, using `writer` for the actual XML generation.
 * @param [graph] The graph instance that is populated.
 * @param [writer] The writer that actually writes the XML content.
 * @see [GraphMLIOHandler.write]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23GraphMLWriter-method-write">Online Documentation</a>
 */
 open   fun write( graph: IGraph ,
 writer: IXmlWriter )
/**
 * Occurs when XML content is about to be serialized.
 * @see [GraphMLIOHandler.addHandleSerializationListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23HandleSerialization">Online Documentation</a>
 */
fun addHandleSerializationListener(listener: EventHandler1<HandleSerializationEventArgs>)
fun removeHandleSerializationListener(listener: EventHandler1<HandleSerializationEventArgs>)

/**
 * Occurs when [IOutputHandler]s are queried.
 * @see [GraphMLIOHandler.addQueryOutputHandlersListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23QueryOutputHandlers">Online Documentation</a>
 */
fun addQueryOutputHandlersListener(listener: EventHandler1<QueryOutputHandlersEventArgs>)
fun removeQueryOutputHandlersListener(listener: EventHandler1<QueryOutputHandlersEventArgs>)

/**
 * Occurs when a reference is queried.
 * @see [GraphMLIOHandler.addQueryReferenceIdListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23QueryReferenceId">Online Documentation</a>
 */
fun addQueryReferenceIdListener(listener: EventHandler1<QueryReferenceIdEventArgs>)
fun removeQueryReferenceIdListener(listener: EventHandler1<QueryReferenceIdEventArgs>)

/**
 * Occurs when the writing of a document has just been finished.
 * @see [onWritten]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23Written">Online Documentation</a>
 */
fun addWrittenListener(listener: EventHandler1<WriteEventArgs>)
fun removeWrittenListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs when the writing of a document is just about to begin.
 * @see [onWriting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23Writing">Online Documentation</a>
 */
fun addWritingListener(listener: EventHandler1<WriteEventArgs>)
fun removeWritingListener(listener: EventHandler1<WriteEventArgs>)

companion object : ClassMetadata<GraphMLWriter> {
}
}

/**
 * Occurs when XML content is about to be serialized.
 * @see [GraphMLIOHandler.addHandleSerializationListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23HandleSerialization">Online Documentation</a>
 */
inline fun  GraphMLWriter.addHandleSerializationHandler(
    crossinline handler: (event:HandleSerializationEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<HandleSerializationEventArgs> = { _, event -> handler(event) }
    addHandleSerializationListener(listener)
    return { removeHandleSerializationListener(listener) }
}
/**
 * Occurs when [IOutputHandler]s are queried.
 * @see [GraphMLIOHandler.addQueryOutputHandlersListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23QueryOutputHandlers">Online Documentation</a>
 */
inline fun  GraphMLWriter.addQueryOutputHandlersHandler(
    crossinline handler: (event:QueryOutputHandlersEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryOutputHandlersEventArgs> = { _, event -> handler(event) }
    addQueryOutputHandlersListener(listener)
    return { removeQueryOutputHandlersListener(listener) }
}
/**
 * Occurs when a reference is queried.
 * @see [GraphMLIOHandler.addQueryReferenceIdListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23QueryReferenceId">Online Documentation</a>
 */
inline fun  GraphMLWriter.addQueryReferenceIdHandler(
    crossinline handler: (event:QueryReferenceIdEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryReferenceIdEventArgs> = { _, event -> handler(event) }
    addQueryReferenceIdListener(listener)
    return { removeQueryReferenceIdListener(listener) }
}
/**
 * Occurs when the writing of a document has just been finished.
 * @see [onWritten]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23Written">Online Documentation</a>
 */
inline fun  GraphMLWriter.addWrittenHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addWrittenListener(listener)
    return { removeWrittenListener(listener) }
}
/**
 * Occurs when the writing of a document is just about to begin.
 * @see [onWriting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriter%23Writing">Online Documentation</a>
 */
inline fun  GraphMLWriter.addWritingHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addWritingListener(listener)
    return { removeWritingListener(listener) }
}
