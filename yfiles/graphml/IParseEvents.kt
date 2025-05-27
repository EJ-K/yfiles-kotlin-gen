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
 * The interface of the event trigger class that is used by the [parseEvents][IParseContext] property.
 * @see [ParseEventArgs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents">Online Documentation</a>
 */
external interface IParseEvents : IEventDispatcher {

  
  companion object : InterfaceMetadata<IParseEvents> {
  }
}

/**
 * `document-parsing`: Occurs when the document is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23document-parsing">Online Documentation</a>
 */
inline fun  IParseEvents.addDocumentParsingHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("document-parsing", listener)
  return { removeEventListener("document-parsing", listener) }
}
/**
 * `document-parsed`: Occurs when the document has been parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23document-parsed">Online Documentation</a>
 */
inline fun  IParseEvents.addDocumentParsedHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("document-parsed", listener)
  return { removeEventListener("document-parsed", listener) }
}
/**
 * `node-parsing`: Occurs when a node element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23node-parsing">Online Documentation</a>
 */
inline fun  IParseEvents.addNodeParsingHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("node-parsing", listener)
  return { removeEventListener("node-parsing", listener) }
}
/**
 * `node-parsed`: Occurs after a node element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23node-parsed">Online Documentation</a>
 */
inline fun  IParseEvents.addNodeParsedHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("node-parsed", listener)
  return { removeEventListener("node-parsed", listener) }
}
/**
 * `edge-parsing`: Occurs when an edge element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23edge-parsing">Online Documentation</a>
 */
inline fun  IParseEvents.addEdgeParsingHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("edge-parsing", listener)
  return { removeEventListener("edge-parsing", listener) }
}
/**
 * `edge-parsed`: Occurs after a edge element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23edge-parsed">Online Documentation</a>
 */
inline fun  IParseEvents.addEdgeParsedHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("edge-parsed", listener)
  return { removeEventListener("edge-parsed", listener) }
}
/**
 * `port-parsing`: Occurs when a port element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23port-parsing">Online Documentation</a>
 */
inline fun  IParseEvents.addPortParsingHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("port-parsing", listener)
  return { removeEventListener("port-parsing", listener) }
}
/**
 * `port-parsed`: Occurs after a port element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23port-parsed">Online Documentation</a>
 */
inline fun  IParseEvents.addPortParsedHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("port-parsed", listener)
  return { removeEventListener("port-parsed", listener) }
}
/**
 * `graph-parsing`: Occurs when a graph element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23graph-parsing">Online Documentation</a>
 */
inline fun  IParseEvents.addGraphParsingHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("graph-parsing", listener)
  return { removeEventListener("graph-parsing", listener) }
}
/**
 * `graph-parsed`: Occurs after a graph element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23graph-parsed">Online Documentation</a>
 */
inline fun  IParseEvents.addGraphParsedHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("graph-parsed", listener)
  return { removeEventListener("graph-parsed", listener) }
}
/**
 * `graph-m-l-parsing`: Occurs when the graphml element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23graph-m-l-parsing">Online Documentation</a>
 */
inline fun  IParseEvents.addGraphMLParsingHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("graph-m-l-parsing", listener)
  return { removeEventListener("graph-m-l-parsing", listener) }
}
/**
 * `graph-m-l-parsed`: Occurs after the graphml element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23graph-m-l-parsed">Online Documentation</a>
 */
inline fun  IParseEvents.addGraphMLParsedHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("graph-m-l-parsed", listener)
  return { removeEventListener("graph-m-l-parsed", listener) }
}
/**
 * `data-parsing`: Occurs when a data element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23data-parsing">Online Documentation</a>
 */
inline fun  IParseEvents.addDataParsingHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("data-parsing", listener)
  return { removeEventListener("data-parsing", listener) }
}
/**
 * `data-parsed`: Occurs after a data element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23data-parsed">Online Documentation</a>
 */
inline fun  IParseEvents.addDataParsedHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("data-parsed", listener)
  return { removeEventListener("data-parsed", listener) }
}
/**
 * `key-parsing`: Occurs when a key element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23key-parsing">Online Documentation</a>
 */
inline fun  IParseEvents.addKeyParsingHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("key-parsing", listener)
  return { removeEventListener("key-parsing", listener) }
}
/**
 * `key-parsed`: Occurs after a key element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23key-parsed">Online Documentation</a>
 */
inline fun  IParseEvents.addKeyParsedHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("key-parsed", listener)
  return { removeEventListener("key-parsed", listener) }
}
