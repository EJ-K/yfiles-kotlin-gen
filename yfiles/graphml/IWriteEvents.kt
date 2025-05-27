// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * The interface of the event trigger class that is used by the [IWriteContext.writeEvents] property.
 * @see [WriteEventArgs]
 * @see [GraphMLWriter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents">Online Documentation</a>
 */
external interface IWriteEvents : YObject, IEventDispatcher {
/**
 * Occurs just after the [IXmlWriter.writeStartDocument] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23DocumentWriting">Online Documentation</a>
 */
fun addDocumentWritingListener(listener: EventHandler1<WriteEventArgs>)
fun removeDocumentWritingListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs just before the [IXmlWriter.writeEndDocument] will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23DocumentWritten">Online Documentation</a>
 */
fun addDocumentWrittenListener(listener: EventHandler1<WriteEventArgs>)
fun removeDocumentWrittenListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'node' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23NodeWriting">Online Documentation</a>
 */
fun addNodeWritingListener(listener: EventHandler1<WriteEventArgs>)
fun removeNodeWritingListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'node' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23NodeWritten">Online Documentation</a>
 */
fun addNodeWrittenListener(listener: EventHandler1<WriteEventArgs>)
fun removeNodeWrittenListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'edge' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23EdgeWriting">Online Documentation</a>
 */
fun addEdgeWritingListener(listener: EventHandler1<WriteEventArgs>)
fun removeEdgeWritingListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'edge' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23EdgeWritten">Online Documentation</a>
 */
fun addEdgeWrittenListener(listener: EventHandler1<WriteEventArgs>)
fun removeEdgeWrittenListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'port' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23PortWriting">Online Documentation</a>
 */
fun addPortWritingListener(listener: EventHandler1<WriteEventArgs>)
fun removePortWritingListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'port' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23PortWritten">Online Documentation</a>
 */
fun addPortWrittenListener(listener: EventHandler1<WriteEventArgs>)
fun removePortWrittenListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'graph' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23GraphWriting">Online Documentation</a>
 */
fun addGraphWritingListener(listener: EventHandler1<WriteEventArgs>)
fun removeGraphWritingListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'graph' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23GraphWritten">Online Documentation</a>
 */
fun addGraphWrittenListener(listener: EventHandler1<WriteEventArgs>)
fun removeGraphWrittenListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'graphml' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23GraphMLWriting">Online Documentation</a>
 */
fun addGraphMLWritingListener(listener: EventHandler1<WriteEventArgs>)
fun removeGraphMLWritingListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'graphml' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23GraphMLWritten">Online Documentation</a>
 */
fun addGraphMLWrittenListener(listener: EventHandler1<WriteEventArgs>)
fun removeGraphMLWrittenListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'data' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23DataWriting">Online Documentation</a>
 */
fun addDataWritingListener(listener: EventHandler1<WriteEventArgs>)
fun removeDataWritingListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'data' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23DataWritten">Online Documentation</a>
 */
fun addDataWrittenListener(listener: EventHandler1<WriteEventArgs>)
fun removeDataWrittenListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'key' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23KeyWriting">Online Documentation</a>
 */
fun addKeyWritingListener(listener: EventHandler1<WriteEventArgs>)
fun removeKeyWritingListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'key' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23KeyWritten">Online Documentation</a>
 */
fun addKeyWrittenListener(listener: EventHandler1<WriteEventArgs>)
fun removeKeyWrittenListener(listener: EventHandler1<WriteEventArgs>)

companion object : InterfaceMetadata<IWriteEvents> {
}
}

/**
 * Occurs just after the [IXmlWriter.writeStartDocument] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23DocumentWriting">Online Documentation</a>
 */
inline fun  IWriteEvents.addDocumentWritingHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addDocumentWritingListener(listener)
    return { removeDocumentWritingListener(listener) }
}
/**
 * Occurs just before the [IXmlWriter.writeEndDocument] will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23DocumentWritten">Online Documentation</a>
 */
inline fun  IWriteEvents.addDocumentWrittenHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addDocumentWrittenListener(listener)
    return { removeDocumentWrittenListener(listener) }
}
/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'node' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23NodeWriting">Online Documentation</a>
 */
inline fun  IWriteEvents.addNodeWritingHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addNodeWritingListener(listener)
    return { removeNodeWritingListener(listener) }
}
/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'node' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23NodeWritten">Online Documentation</a>
 */
inline fun  IWriteEvents.addNodeWrittenHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addNodeWrittenListener(listener)
    return { removeNodeWrittenListener(listener) }
}
/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'edge' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23EdgeWriting">Online Documentation</a>
 */
inline fun  IWriteEvents.addEdgeWritingHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addEdgeWritingListener(listener)
    return { removeEdgeWritingListener(listener) }
}
/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'edge' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23EdgeWritten">Online Documentation</a>
 */
inline fun  IWriteEvents.addEdgeWrittenHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addEdgeWrittenListener(listener)
    return { removeEdgeWrittenListener(listener) }
}
/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'port' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23PortWriting">Online Documentation</a>
 */
inline fun  IWriteEvents.addPortWritingHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addPortWritingListener(listener)
    return { removePortWritingListener(listener) }
}
/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'port' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23PortWritten">Online Documentation</a>
 */
inline fun  IWriteEvents.addPortWrittenHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addPortWrittenListener(listener)
    return { removePortWrittenListener(listener) }
}
/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'graph' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23GraphWriting">Online Documentation</a>
 */
inline fun  IWriteEvents.addGraphWritingHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addGraphWritingListener(listener)
    return { removeGraphWritingListener(listener) }
}
/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'graph' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23GraphWritten">Online Documentation</a>
 */
inline fun  IWriteEvents.addGraphWrittenHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addGraphWrittenListener(listener)
    return { removeGraphWrittenListener(listener) }
}
/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'graphml' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23GraphMLWriting">Online Documentation</a>
 */
inline fun  IWriteEvents.addGraphMLWritingHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addGraphMLWritingListener(listener)
    return { removeGraphMLWritingListener(listener) }
}
/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'graphml' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23GraphMLWritten">Online Documentation</a>
 */
inline fun  IWriteEvents.addGraphMLWrittenHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addGraphMLWrittenListener(listener)
    return { removeGraphMLWrittenListener(listener) }
}
/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'data' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23DataWriting">Online Documentation</a>
 */
inline fun  IWriteEvents.addDataWritingHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addDataWritingListener(listener)
    return { removeDataWritingListener(listener) }
}
/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'data' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23DataWritten">Online Documentation</a>
 */
inline fun  IWriteEvents.addDataWrittenHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addDataWrittenListener(listener)
    return { removeDataWrittenListener(listener) }
}
/**
 * Occurs right after the [IXmlWriter.writeStartElement] method for writing a GraphMl 'key' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23KeyWriting">Online Documentation</a>
 */
inline fun  IWriteEvents.addKeyWritingHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addKeyWritingListener(listener)
    return { removeKeyWritingListener(listener) }
}
/**
 * Occurs just before the [IXmlWriter.writeEndElement] for the GraphML 'key' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23KeyWritten">Online Documentation</a>
 */
inline fun  IWriteEvents.addKeyWrittenHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addKeyWrittenListener(listener)
    return { removeKeyWrittenListener(listener) }
}
