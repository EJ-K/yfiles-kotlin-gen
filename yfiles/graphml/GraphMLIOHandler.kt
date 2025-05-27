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
import yfiles.collections.IMap
import yfiles.collections.IMapper
import yfiles.graph.IGraph
import yfiles.lang.Action2
import yfiles.lang.Action3
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.Func2
import yfiles.lang.Func4
import yfiles.lang.IClassMetadata
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate

/**
 * Reads and writes [graphs][IGraph] from/to the GraphML format.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GraphMLIOHandler].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-constructor-GraphMLIOHandler">Online Documentation</a>
 */
open external class GraphMLIOHandler () : IEventDispatcher {
  /**
   * Gets or sets a value indicating whether to clear an existing graph instance before reading
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23clearGraphBeforeRead">Online Documentation</a>
   */
  final var clearGraphBeforeRead: Boolean
  
  /**
   * Gets the mapper for the overrides of the deserialization properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23deserializationPropertyOverrides">Online Documentation</a>
   */
  final val deserializationPropertyOverrides: IMap<String, Any>
  
  /**
   * Gets the mapper for the overrides of the serialization properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23serializationPropertyOverrides">Online Documentation</a>
   */
  final val serializationPropertyOverrides: IMap<String, Any>
  
  /**
   * Register `graphData` as an input data target for GraphML data that is present at the graph level.
   * @param [TValue] The type of the mapper values
   * @param [dataType] The type of the mapper values
   * @param [keyDefinitionPredicate] Predicate function to select the correct GraphML attribute
   * @param [graphData] Delegate that stores the graph data dynamically
   * @param [deserializationCallback] Custom deserialization callback.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addGraphInputData(Constructor,system.Predicate,system.Action2,system.Func4)">Online Documentation</a>
   */
  fun <TValue> addGraphInputData(
    dataType: IClassMetadata<TValue>,
    keyDefinitionPredicate: Predicate<Element>,
    graphData: Action2<IGraph, TValue>,
    deserializationCallback: Func4<IParseContext, Node, IClassMetadata<*>, TValue>  = definedExternally,
  )
  
  /**
   * Register `graphData` as an input data target for GraphML data that is present at the graph level.
   * @param [TValue] The type of the mapper values
   * @param [dataType] The type of the mapper values
   * @param [name] The name of the attribute
   * @param [graphData] Delegate that stores the graph data dynamically
   * @param [deserializationCallback] custom deserialization callback.
   * @param [uri] The optional URI of the key definition to disambiguate keys.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addGraphInputData(Constructor,string,system.Action2,system.Func4,string)">Online Documentation</a>
   */
  fun <TValue> addGraphInputData(
    dataType: IClassMetadata<TValue>,
    name: String?,
    graphData: Action2<IGraph, TValue>,
    deserializationCallback: Func4<IParseContext, Node, IClassMetadata<*>, TValue>  = definedExternally,
    uri: String  = definedExternally,
  )
  
  /**
   * Register `graphData` as an output data source for data that is written at the graph level.
   * @param [TValue] The type of the mapper values
   * @param [dataType] The type of the mapper values
   * @param [name] The name of the attribute
   * @param [graphData] the data that is written at the top level
   * @param [serializationCallback] custom serialization callback.
   * @param [declaredKeyType] The key type to write in the declaration. If this is omitted or `null`, the type is inferred automatically from `TValue`
   * @param [uri] The optional URI to add to the key definition to disambiguate keys.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addGraphOutputData(Constructor,string,TValue,system.Action3,KeyType,string)">Online Documentation</a>
   */
  fun <TValue> addGraphOutputData(
    dataType: IClassMetadata<TValue>,
    name: String?,
    graphData: TValue,
    serializationCallback: Action3<IWriteContext, TValue, IClassMetadata<*>>  = definedExternally,
    declaredKeyType: KeyType  = definedExternally,
    uri: String  = definedExternally,
  )
  
  /**
   * Register `graphData` as an output data source for data that is written at the graph level.
   * @param [TValue] The type of the mapper values
   * @param [dataType] The type of the mapper values
   * @param [name] The name of the attribute
   * @param [graphData] Delegate that retrieves the graph data dynamically
   * @param [serializationCallback] custom serialization callback.
   * @param [declaredKeyType] The key type to write in the declaration. If this is omitted or `null`, the type is inferred automatically from `TValue`
   * @param [uri] The optional URI to add to the key definition to disambiguate keys.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addGraphOutputData(Constructor,string,system.Func2,system.Action3,KeyType,string)">Online Documentation</a>
   */
  fun <TValue> addGraphOutputData(
    dataType: IClassMetadata<TValue>,
    name: String?,
    graphData: Func2<IGraph, TValue>,
    serializationCallback: Action3<IWriteContext, TValue, IClassMetadata<*>>  = definedExternally,
    declaredKeyType: KeyType  = definedExternally,
    uri: String  = definedExternally,
  )
  
  /**
   * Register an [IMapper] instance for use as an input data target.
   * @param [TKey] The type of the mapper keys
   * @param [TData] The type of the mapper values
   * @param [keyType] The type of the mapper keys
   * @param [dataType] The type of the mapper values
   * @param [name] The name of the attribute
   * @param [mapper] the mapper that serves as data source
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addInputMapper(Constructor,Constructor,string,IMapper)">Online Documentation</a>
   */
  fun <TKey, TData> addInputMapper(
    keyType: IClassMetadata<TKey>,
    dataType: IClassMetadata<TData>,
    name: String,
    mapper: IMapper<TKey, TData>,
  )
  
  /**
   * Register an [IMapper] instance for use as an input data target.
   * @param [TKey] The type of the mapper keys
   * @param [TData] The type of the mapper values
   * @param [keyType] The type of the mapper keys
   * @param [dataType] The type of the mapper values
   * @param [keyDefinitionPredicate] The predicate function that will determine whether to create an [IInputHandler] for the given key definition.
   * @param [mapper] the mapper that serves as data source
   * @param [deserializationCallback] custom deserialization callback.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addInputMapper(Constructor,Constructor,system.Predicate,IMapper,system.Func4)">Online Documentation</a>
   */
  fun <TKey, TData> addInputMapper(
    keyType: IClassMetadata<TKey>,
    dataType: IClassMetadata<TData>,
    keyDefinitionPredicate: Predicate<Element>,
    mapper: IMapper<TKey, TData>,
    deserializationCallback: Func4<IParseContext, Node, IClassMetadata<*>, TData>?,
  )
  
  /**
   * Adds a namespace to the header of a GraphML file.
   * @param [namespaceURI] The namespace URI
   * @param [shortName] The namespace prefix
   * @throws ArgumentError If `namespaceURI` is `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addNamespace">Online Documentation</a>
   */
  open fun addNamespace(
    namespaceURI: String,
    shortName: String?,
  )
  
  /**
   * Register an [IMapper] instance for use as an output data source
   * @param [TModelItem] The type of the mapper keys
   * @param [TValue] The type of the mapper values
   * @param [modelItemType] The type of the mapper keys
   * @param [dataType] The type of the mapper values
   * @param [name] The name of the attribute
   * @param [mapper] the mapper that serves as data source
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addOutputMapper(Constructor,Constructor,string,IMapper)">Online Documentation</a>
   */
  fun <TModelItem, TValue> addOutputMapper(
    modelItemType: IClassMetadata<TModelItem>,
    dataType: IClassMetadata<TValue>,
    name: String?,
    mapper: IMapper<TModelItem, TValue>,
  )
  
  /**
   * Register an [IMapper] instance for use as an output data source.
   * @param [TModelItem] The type of the mapper keys
   * @param [TValue] The type of the mapper values
   * @param [modelItemType] The type of the mapper keys
   * @param [dataType] The type of the mapper values
   * @param [name] The name of the attribute
   * @param [uri] The URI to add to the key definition to disambiguate keys.
   * @param [mapper] the mapper that serves as data source
   * @param [serializationCallback] custom serialization callback.
   * @param [declaredKeyType] The key type to write in the declaration.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addOutputMapper(Constructor,Constructor,string,string,IMapper,system.Action3,KeyType)">Online Documentation</a>
   */
  fun <TModelItem, TValue> addOutputMapper(
    modelItemType: IClassMetadata<TModelItem>,
    dataType: IClassMetadata<TValue>,
    name: String?,
    uri: String?,
    mapper: IMapper<TModelItem, TValue>,
    serializationCallback: Action3<IWriteContext, TValue, IClassMetadata<*>>?,
    declaredKeyType: KeyType,
  )
  
  /**
   * Adds a schema location to the header of a GraphML file.
   * @param [schemaNamespace] The namespace URI for this schema location
   * @param [schemaLocation] The schema location
   * @throws ArgumentError If `schemaNamespace` is `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addSchemaLocation">Online Documentation</a>
   */
  open fun addSchemaLocation(
    schemaNamespace: String,
    schemaLocation: String?,
  )
  
  /**
   * Add a namespace mapping between an XML namespace and a JavaScript `module`.
   * @param [xmlNamespace] The XML namespace that corresponds to `module`.
   * @param [module] The module that is mapped to the XML namespace. The keys are the names of the XML tags. The values are the types.
   * @see [IXamlNameMapper]
   * @see [createXamlNameMapper]
   * @see [addTypeInformation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addXamlNamespaceMapping">Online Documentation</a>
   */
  fun addXamlNamespaceMapping(
    xmlNamespace: String,
    module: Any,
  )
  
  /**
   * Allows for configuration of the initial [IParseContext] that is used for reading a GraphML file.
   * @param [rootContext] The initial parse context that is created by the framework.
   * @return A suitably configured parse context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureParseContext">Online Documentation</a>
   */
  protected open fun configureParseContext(
    rootContext: IParseContext,
  ): IParseContext
  
  /**
   * Allows for configuration of the initial [IWriteContext] that is used for writing a GraphML file.
   * @param [rootContext] The initial write context that is created by the framework.
   * @return A suitably configured write context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureWriteContext">Online Documentation</a>
   */
  protected open fun configureWriteContext(
    rootContext: IWriteContext,
  ): IWriteContext
  
  /**
   * Creates the default value serializer context and returns it.
   * @return An implementation of the [IValueSerializerContext] interface.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createDefaultValueSerializerContext">Online Documentation</a>
   */
  protected open fun createDefaultValueSerializerContext(): IValueSerializerContext
  
  /**
   * Factory method that creates and configures a suitable [IXmlWriter] implementation.
   * @return A suitable [IXmlWriter] instance for the serialization
   * @see [IWriteContext.writer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createXMLWriter">Online Documentation</a>
   */
  protected open fun createXMLWriter(): IXmlWriter
  
  /**
   * Configure mappings from CLR to XML names.
   * @return The configured [IXamlNameMapper].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createXamlNameMapper">Online Documentation</a>
   */
  protected open fun createXamlNameMapper(): IXamlNameMapper?
  
  /**
   * Configure mappings from XML namespaces to prefixes.
   * @return The configured [IXamlPrefixMapper].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createXamlPrefixMapper">Online Documentation</a>
   */
  protected open fun createXamlPrefixMapper(): IXamlPrefixMapper
  
  /**
   * Parses the XML document `document` into an `graph` instance.
   * @param [graph] The graph instance that is populated.
   * @param [document] The XML document instance to parse.
   * @param [context] The initial parse context.
   * @return A `Promise` that will resolve once the `graph` is populated with the content read from the `document`.
   * @see [readFromDocument]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-parse">Online Documentation</a>
   */
  protected open fun parse(
    graph: IGraph,
    document: Document,
    context: IParseContext,
  ): Promise<IGraph>
  
  /**
   * Read GraphML from an existing XML document.
   * @param [graph] The graph that is to be populated with nodes and edges as read from the document.
   * @param [document] The XML document.
   * @return A `Promise` that will resolve once the `graph` is populated with the content read from the `document`.
   * @throws ArgumentError `document` is null.
   * @throws ArgumentError `graph` is null.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-readFromDocument">Online Documentation</a>
   */
  open fun readFromDocument(
    graph: IGraph,
    document: Document,
  ): Promise<IGraph>
  
  /**
   * Convenience method that imports the `graph` from an XML data provided in a string `data`.
   * @param [graph] The Graph object that is to be populated with nodes and edges as read from the GraphML data.
   * @param [data] A string that contains GraphML data.
   * @return A `Promise` that will resolve once the `graph` is populated with the content read from the `data`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-readFromGraphMLText">Online Documentation</a>
   */
  open fun readFromGraphMLText(
    graph: IGraph,
    data: String,
  ): Promise<IGraph>
  
  /**
   * Reads GraphML content from the given `url` and populates the `graph`.
   * @param [graph] The graph that is to be populated with nodes and edges as read from the URL.
   * @param [url] The URL of the file to be read.
   * @return A `Promise` that will resolve once the `graph` is populated with the content read from the `url`.
   * @throws ArgumentError `url` is null.
   * @throws ArgumentError `graph` is null.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-readFromURL">Online Documentation</a>
   */
  open fun readFromURL(
    graph: IGraph,
    url: String,
  ): Promise<IGraph>
  
  /**
   * Writes the given graph object to GraphML.
   * @param [graph] The Graph object that is to be written to a GraphML file.
   * @return A string containing the GraphML data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-write">Online Documentation</a>
   */
  open fun write(
    graph: IGraph,
  ): Promise<String>
  
  companion object : ClassMetadata<GraphMLIOHandler> {
    /**
     * Creates an [IInputHandler] implementation that matches the provided `TKey` and `TData`.
     * @param [TKey] The type of the mapper keys
     * @param [TData] The type of the mapper entries
     * @param [modelItemType] The type of the mapper keys
     * @param [dataType] The type of the mapper entries
     * @param [mapper] The mapper to use.
     * @param [deserializationCallback] Optional deserialization callback for complex data.
     * @return A suitable [MapperInputHandler] implementation
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createMapperInputHandler">Online Documentation</a>
     */
    fun <TKey, TData> createMapperInputHandler(
      modelItemType: IClassMetadata<TKey>,
      dataType: IClassMetadata<TData>,
      mapper: IMapper<TKey, TData>?,
      deserializationCallback: Func4<IParseContext, Node, IClassMetadata<*>, TData>?,
    ): MapperInputHandler<TKey, TData>
    
    /**
     * Creates an [IOutputHandler] implementation that matches the provided `TKey` and `TData`.
     * @param [TKey] The type of the mapper keys
     * @param [TData] The type of the mapper entries
     * @param [modelItemType] The type of the mapper keys
     * @param [dataType] The type of the mapper entries
     * @param [name] The name of the graphml attribute
     * @param [mapper] The mapper to use.
     * @param [serializationCallback] Optional serialization callback for complex data.
     * @return A suitable [MapperOutputHandler] implementation
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createMapperOutputHandler">Online Documentation</a>
     */
    fun <TKey, TData> createMapperOutputHandler(
      modelItemType: IClassMetadata<TKey>,
      dataType: IClassMetadata<TData>,
      name: String?,
      mapper: IMapper<TKey, TData>?,
      serializationCallback: Action3<IWriteContext, TData, IClassMetadata<*>>?,
    ): MapperOutputHandler<TKey, TData>
    
    /**
     * Checks whether the `name` attribute in `definition` matches `name`
     * @param [definition] The key definition to check
     * @param [name] The name that should be matched
     * @return `true` if the name attribute in `definition` matches `name`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-matchesName">Online Documentation</a>
     */
    fun matchesName(
      definition: Element,
      name: String?,
    ): Boolean
    
    /**
     * Checks whether the `scope` attribute in `definition` matches `scope`
     * @param [definition] The key definition to check
     * @param [scope] The scope that should be matched
     * @return `true` if the scope attribute in `definition` matches `scope`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-matchesScope">Online Documentation</a>
     */
    fun matchesScope(
      definition: Element,
      scope: KeyScope,
    ): Boolean
    
    /**
     * Checks whether the `type` attribute in `definition` matches `type`
     * @param [definition] The key definition to check
     * @param [type] The type that should be matched
     * @return `true` if the type attribute in `definition` matches `type`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-matchesType">Online Documentation</a>
     */
    fun matchesType(
      definition: Element,
      type: KeyType,
    ): Boolean
    
    /**
     * Checks whether the `uri` attribute in `definition` matches `uri`
     * @param [definition] The key definition to check
     * @param [uri] The uri that should be matched
     * @return `true` if the uri attribute in `definition` matches `uri`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-matchesUri">Online Documentation</a>
     */
    fun matchesUri(
      definition: Element,
      uri: String?,
    ): Boolean
  }
}

inline fun GraphMLIOHandler(
    block: GraphMLIOHandler.() -> Unit
): GraphMLIOHandler {
    return GraphMLIOHandler()
        .apply(block)
}

/**
 * `override-resolve-reference`: Occurs before inline references are evaluated.
 * @see [addResolveReferenceHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23override-resolve-reference">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addOverrideResolveReferenceHandler(
  crossinline handler: (event:ResolveReferenceEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ResolveReferenceEventArgs> = { event, _ -> handler(event) }
  addEventListener("override-resolve-reference", listener)
  return { removeEventListener("override-resolve-reference", listener) }
}

/**
 * `resolve-reference`: Occurs after references are evaluated.
 * @see [addOverrideResolveReferenceHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23resolve-reference">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addResolveReferenceHandler(
  crossinline handler: (event:ResolveReferenceEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ResolveReferenceEventArgs> = { event, _ -> handler(event) }
  addEventListener("resolve-reference", listener)
  return { removeEventListener("resolve-reference", listener) }
}

/**
 * `query-reference-id`: Occurs when a reference is queried.
 * @see [QueryReferenceIdEventArgs.addReferenceIdHandler]
 * @see [QueryReferenceIdEventArgs.addReferenceTypeHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23query-reference-id">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addQueryReferenceIdHandler(
  crossinline handler: (event:QueryReferenceIdEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<QueryReferenceIdEventArgs> = { event, _ -> handler(event) }
  addEventListener("query-reference-id", listener)
  return { removeEventListener("query-reference-id", listener) }
}

/**
 * `written`: Occurs when the writing of a document has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23written">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addWrittenHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("written", listener)
  return { removeEventListener("written", listener) }
}

/**
 * `writing`: Occurs when the writing of a document is just about to begin.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23writing">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addWritingHandler(
  crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<WriteEventArgs> = { event, _ -> handler(event) }
  addEventListener("writing", listener)
  return { removeEventListener("writing", listener) }
}

/**
 * `query-type`: Occurs when a type is queried.
 * @see [QueryTypeEventArgs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23query-type">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addQueryTypeHandler(
  crossinline handler: (event:QueryTypeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<QueryTypeEventArgs> = { event, _ -> handler(event) }
  addEventListener("query-type", listener)
  return { removeEventListener("query-type", listener) }
}

/**
 * `query-name`: Occurs when a name is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23query-name">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addQueryNameHandler(
  crossinline handler: (event:QueryNameEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<QueryNameEventArgs> = { event, _ -> handler(event) }
  addEventListener("query-name", listener)
  return { removeEventListener("query-name", listener) }
}

/**
 * `handle-serialization`: Occurs when XML content is about to be serialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23handle-serialization">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addHandleSerializationHandler(
  crossinline handler: (event:HandleSerializationEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<HandleSerializationEventArgs> = { event, _ -> handler(event) }
  addEventListener("handle-serialization", listener)
  return { removeEventListener("handle-serialization", listener) }
}

/**
 * `query-output-handlers`: Occurs when a GraphML attribute is about to be written.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23query-output-handlers">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addQueryOutputHandlersHandler(
  crossinline handler: (event:QueryOutputHandlersEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<QueryOutputHandlersEventArgs> = { event, _ -> handler(event) }
  addEventListener("query-output-handlers", listener)
  return { removeEventListener("query-output-handlers", listener) }
}

/**
 * `parsed`: Occurs when the document has been parsed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23parsed">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addParsedHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("parsed", listener)
  return { removeEventListener("parsed", listener) }
}

/**
 * `parsing`: Occurs when the parsing of a document is just about to begin.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23parsing">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addParsingHandler(
  crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ParseEventArgs> = { event, _ -> handler(event) }
  addEventListener("parsing", listener)
  return { removeEventListener("parsing", listener) }
}

/**
 * `query-input-handlers`: Occurs when a GraphML attribute is about to be read.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23query-input-handlers">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addQueryInputHandlersHandler(
  crossinline handler: (event:QueryInputHandlersEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<QueryInputHandlersEventArgs> = { event, _ -> handler(event) }
  addEventListener("query-input-handlers", listener)
  return { removeEventListener("query-input-handlers", listener) }
}

/**
 * `handle-deserialization`: Occurs when XML content is about to be deserialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23handle-deserialization">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addHandleDeserializationHandler(
  crossinline handler: (event:HandleDeserializationEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<HandleDeserializationEventArgs> = { event, _ -> handler(event) }
  addEventListener("handle-deserialization", listener)
  return { removeEventListener("handle-deserialization", listener) }
}
