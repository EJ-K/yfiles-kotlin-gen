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

/**
 * The interface of the event trigger class that is used by the [writeEvents][IWriteContext] property.
 * @see [WriteEventArgs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents">Online Documentation</a>
 */
external interface IWriteEvents : IEventDispatcher {

  
  companion object : InterfaceMetadata<IWriteEvents> {
  }
}

/**
 * `document-writing`: Occurs just after the [writeStartDocument][IXmlWriter] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23document-writing">Online Documentation</a>
 */
inline fun  IWriteEvents.addDocumentWritingHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("document-writing", listener)
  return { removeEventListener("document-writing", listener) }
}
/**
 * `document-written`: Occurs just before the [writeEndDocument][IXmlWriter] will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23document-written">Online Documentation</a>
 */
inline fun  IWriteEvents.addDocumentWrittenHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("document-written", listener)
  return { removeEventListener("document-written", listener) }
}
/**
 * `node-writing`: Occurs right after the [writeStartElement][IXmlWriter] method for writing a GraphMl 'node' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23node-writing">Online Documentation</a>
 */
inline fun  IWriteEvents.addNodeWritingHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("node-writing", listener)
  return { removeEventListener("node-writing", listener) }
}
/**
 * `node-written`: Occurs just before the [writeEndElement][IXmlWriter] for the GraphML 'node' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23node-written">Online Documentation</a>
 */
inline fun  IWriteEvents.addNodeWrittenHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("node-written", listener)
  return { removeEventListener("node-written", listener) }
}
/**
 * `edge-writing`: Occurs right after the [writeStartElement][IXmlWriter] method for writing a GraphMl 'edge' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23edge-writing">Online Documentation</a>
 */
inline fun  IWriteEvents.addEdgeWritingHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("edge-writing", listener)
  return { removeEventListener("edge-writing", listener) }
}
/**
 * `edge-written`: Occurs just before the [writeEndElement][IXmlWriter] for the GraphML 'edge' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23edge-written">Online Documentation</a>
 */
inline fun  IWriteEvents.addEdgeWrittenHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("edge-written", listener)
  return { removeEventListener("edge-written", listener) }
}
/**
 * `port-writing`: Occurs right after the [writeStartElement][IXmlWriter] method for writing a GraphMl 'port' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23port-writing">Online Documentation</a>
 */
inline fun  IWriteEvents.addPortWritingHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("port-writing", listener)
  return { removeEventListener("port-writing", listener) }
}
/**
 * `port-written`: Occurs just before the [writeEndElement][IXmlWriter] for the GraphML 'port' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23port-written">Online Documentation</a>
 */
inline fun  IWriteEvents.addPortWrittenHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("port-written", listener)
  return { removeEventListener("port-written", listener) }
}
/**
 * `graph-writing`: Occurs right after the [writeStartElement][IXmlWriter] method for writing a GraphMl 'graph' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23graph-writing">Online Documentation</a>
 */
inline fun  IWriteEvents.addGraphWritingHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("graph-writing", listener)
  return { removeEventListener("graph-writing", listener) }
}
/**
 * `graph-written`: Occurs just before the [writeEndElement][IXmlWriter] for the GraphML 'graph' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23graph-written">Online Documentation</a>
 */
inline fun  IWriteEvents.addGraphWrittenHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("graph-written", listener)
  return { removeEventListener("graph-written", listener) }
}
/**
 * `graph-m-l-writing`: Occurs right after the [writeStartElement][IXmlWriter] method for writing a GraphMl 'graphml' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23graph-m-l-writing">Online Documentation</a>
 */
inline fun  IWriteEvents.addGraphMLWritingHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("graph-m-l-writing", listener)
  return { removeEventListener("graph-m-l-writing", listener) }
}
/**
 * `graph-m-l-written`: Occurs just before the [writeEndElement][IXmlWriter] for the GraphML 'graphml' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23graph-m-l-written">Online Documentation</a>
 */
inline fun  IWriteEvents.addGraphMLWrittenHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("graph-m-l-written", listener)
  return { removeEventListener("graph-m-l-written", listener) }
}
/**
 * `data-writing`: Occurs right after the [writeStartElement][IXmlWriter] method for writing a GraphMl 'data' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23data-writing">Online Documentation</a>
 */
inline fun  IWriteEvents.addDataWritingHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("data-writing", listener)
  return { removeEventListener("data-writing", listener) }
}
/**
 * `data-written`: Occurs just before the [writeEndElement][IXmlWriter] for the GraphML 'data' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23data-written">Online Documentation</a>
 */
inline fun  IWriteEvents.addDataWrittenHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("data-written", listener)
  return { removeEventListener("data-written", listener) }
}
/**
 * `key-writing`: Occurs right after the [writeStartElement][IXmlWriter] method for writing a GraphMl 'key' element has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23key-writing">Online Documentation</a>
 */
inline fun  IWriteEvents.addKeyWritingHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("key-writing", listener)
  return { removeEventListener("key-writing", listener) }
}
/**
 * `key-written`: Occurs just before the [writeEndElement][IXmlWriter] for the GraphML 'key' element will be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteEvents%23key-written">Online Documentation</a>
 */
inline fun  IWriteEvents.addKeyWrittenHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("key-written", listener)
  return { removeEventListener("key-written", listener) }
}
