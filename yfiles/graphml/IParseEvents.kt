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
 * The interface of the event trigger class that is used by the [IParseContext.parseEvents] property.
 * @see [ParseEventArgs]
 * @see [GraphMLParser]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents">Online Documentation</a>
 */
external interface IParseEvents : YObject, IEventDispatcher {
/**
 * Occurs when the document is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23DocumentParsing">Online Documentation</a>
 */
fun addDocumentParsingListener(listener: EventHandler1<ParseEventArgs>)
fun removeDocumentParsingListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when the document has been parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23DocumentParsed">Online Documentation</a>
 */
fun addDocumentParsedListener(listener: EventHandler1<ParseEventArgs>)
fun removeDocumentParsedListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when a node element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23NodeParsing">Online Documentation</a>
 */
fun addNodeParsingListener(listener: EventHandler1<ParseEventArgs>)
fun removeNodeParsingListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs after a node element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23NodeParsed">Online Documentation</a>
 */
fun addNodeParsedListener(listener: EventHandler1<ParseEventArgs>)
fun removeNodeParsedListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when an edge element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23EdgeParsing">Online Documentation</a>
 */
fun addEdgeParsingListener(listener: EventHandler1<ParseEventArgs>)
fun removeEdgeParsingListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs after a edge element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23EdgeParsed">Online Documentation</a>
 */
fun addEdgeParsedListener(listener: EventHandler1<ParseEventArgs>)
fun removeEdgeParsedListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when a port element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23PortParsing">Online Documentation</a>
 */
fun addPortParsingListener(listener: EventHandler1<ParseEventArgs>)
fun removePortParsingListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs after a port element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23PortParsed">Online Documentation</a>
 */
fun addPortParsedListener(listener: EventHandler1<ParseEventArgs>)
fun removePortParsedListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when a graph element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23GraphParsing">Online Documentation</a>
 */
fun addGraphParsingListener(listener: EventHandler1<ParseEventArgs>)
fun removeGraphParsingListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs after a graph element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23GraphParsed">Online Documentation</a>
 */
fun addGraphParsedListener(listener: EventHandler1<ParseEventArgs>)
fun removeGraphParsedListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when the graphml element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23GraphMLParsing">Online Documentation</a>
 */
fun addGraphMLParsingListener(listener: EventHandler1<ParseEventArgs>)
fun removeGraphMLParsingListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs after the graphml element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23GraphMLParsed">Online Documentation</a>
 */
fun addGraphMLParsedListener(listener: EventHandler1<ParseEventArgs>)
fun removeGraphMLParsedListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when a data element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23DataParsing">Online Documentation</a>
 */
fun addDataParsingListener(listener: EventHandler1<ParseEventArgs>)
fun removeDataParsingListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs after a data element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23DataParsed">Online Documentation</a>
 */
fun addDataParsedListener(listener: EventHandler1<ParseEventArgs>)
fun removeDataParsedListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when a key element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23KeyParsing">Online Documentation</a>
 */
fun addKeyParsingListener(listener: EventHandler1<ParseEventArgs>)
fun removeKeyParsingListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs after a key element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23KeyParsed">Online Documentation</a>
 */
fun addKeyParsedListener(listener: EventHandler1<ParseEventArgs>)
fun removeKeyParsedListener(listener: EventHandler1<ParseEventArgs>)

companion object : InterfaceMetadata<IParseEvents> {
}
}

/**
 * Occurs when the document is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23DocumentParsing">Online Documentation</a>
 */
inline fun  IParseEvents.addDocumentParsingHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addDocumentParsingListener(listener)
    return { removeDocumentParsingListener(listener) }
}
/**
 * Occurs when the document has been parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23DocumentParsed">Online Documentation</a>
 */
inline fun  IParseEvents.addDocumentParsedHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addDocumentParsedListener(listener)
    return { removeDocumentParsedListener(listener) }
}
/**
 * Occurs when a node element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23NodeParsing">Online Documentation</a>
 */
inline fun  IParseEvents.addNodeParsingHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addNodeParsingListener(listener)
    return { removeNodeParsingListener(listener) }
}
/**
 * Occurs after a node element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23NodeParsed">Online Documentation</a>
 */
inline fun  IParseEvents.addNodeParsedHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addNodeParsedListener(listener)
    return { removeNodeParsedListener(listener) }
}
/**
 * Occurs when an edge element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23EdgeParsing">Online Documentation</a>
 */
inline fun  IParseEvents.addEdgeParsingHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addEdgeParsingListener(listener)
    return { removeEdgeParsingListener(listener) }
}
/**
 * Occurs after a edge element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23EdgeParsed">Online Documentation</a>
 */
inline fun  IParseEvents.addEdgeParsedHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addEdgeParsedListener(listener)
    return { removeEdgeParsedListener(listener) }
}
/**
 * Occurs when a port element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23PortParsing">Online Documentation</a>
 */
inline fun  IParseEvents.addPortParsingHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addPortParsingListener(listener)
    return { removePortParsingListener(listener) }
}
/**
 * Occurs after a port element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23PortParsed">Online Documentation</a>
 */
inline fun  IParseEvents.addPortParsedHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addPortParsedListener(listener)
    return { removePortParsedListener(listener) }
}
/**
 * Occurs when a graph element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23GraphParsing">Online Documentation</a>
 */
inline fun  IParseEvents.addGraphParsingHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addGraphParsingListener(listener)
    return { removeGraphParsingListener(listener) }
}
/**
 * Occurs after a graph element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23GraphParsed">Online Documentation</a>
 */
inline fun  IParseEvents.addGraphParsedHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addGraphParsedListener(listener)
    return { removeGraphParsedListener(listener) }
}
/**
 * Occurs when the graphml element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23GraphMLParsing">Online Documentation</a>
 */
inline fun  IParseEvents.addGraphMLParsingHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addGraphMLParsingListener(listener)
    return { removeGraphMLParsingListener(listener) }
}
/**
 * Occurs after the graphml element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23GraphMLParsed">Online Documentation</a>
 */
inline fun  IParseEvents.addGraphMLParsedHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addGraphMLParsedListener(listener)
    return { removeGraphMLParsedListener(listener) }
}
/**
 * Occurs when a data element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23DataParsing">Online Documentation</a>
 */
inline fun  IParseEvents.addDataParsingHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addDataParsingListener(listener)
    return { removeDataParsingListener(listener) }
}
/**
 * Occurs after a data element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23DataParsed">Online Documentation</a>
 */
inline fun  IParseEvents.addDataParsedHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addDataParsedListener(listener)
    return { removeDataParsedListener(listener) }
}
/**
 * Occurs when a key element is about to be parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23KeyParsing">Online Documentation</a>
 */
inline fun  IParseEvents.addKeyParsingHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addKeyParsingListener(listener)
    return { removeKeyParsingListener(listener) }
}
/**
 * Occurs after a key element has been fully parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseEvents%23KeyParsed">Online Documentation</a>
 */
inline fun  IParseEvents.addKeyParsedHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addKeyParsedListener(listener)
    return { removeKeyParsedListener(listener) }
}
