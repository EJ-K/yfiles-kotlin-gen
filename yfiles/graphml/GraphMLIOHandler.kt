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
import yfiles.collections.IMap
import yfiles.collections.IMapper
import yfiles.graph.DataTag
import yfiles.graph.IGraph
import yfiles.graph.IModelItem
import yfiles.lang.Action2
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.Func2
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Reads and writes [graphs][IGraph] from/to the GraphML format.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GraphMLIOHandler].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-constructor-GraphMLIOHandler">Online Documentation</a>
 */
external open class GraphMLIOHandler  () : YObject, IEventDispatcher {

/**
 * Gets or sets a value indicating whether to clear an existing graph instance before reading
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23clearGraphBeforeRead">Online Documentation</a>
 */
final var clearGraphBeforeRead: Boolean
/**
 * Gets the mapper for the overrides of the deserialization properties.
 * @see [configureDeserializationPropertyOverrides]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23deserializationPropertyOverrides">Online Documentation</a>
 */
final val deserializationPropertyOverrides: IMap<String, Any>
/**
 * Gets the mapper for the overrides of the serialization properties.
 * @see [configureSerializationPropertyOverrides]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23serializationPropertyOverrides">Online Documentation</a>
 */
final val serializationPropertyOverrides: IMap<String, Any>
/**
 * Gets or sets a value indicating whether to support object sharing on output.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23writeSharedReferences">Online Documentation</a>
 */
final var writeSharedReferences: Boolean
/**
 * Gets or sets a value indicating whether schema descriptions should be written.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23writeXMLSchema">Online Documentation</a>
 */
final var writeXMLSchema: Boolean
/**
 * Register `graphData` as an input data target for GraphML data that is present at the graph level.
 * @param [TValue] The type of the mapper values
 * @param [dataType] The type of the mapper values
 * @param [keyDefinitionPredicate] Predicate function to select the correct GraphML attribute
 * @param [graphData] Delegate that stores the graph data dynamically
 * @param [deserializationCallback] custom deserialization callback.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addGraphInputData(yfiles.lang.Class,system.Predicate,system.Action2,system.EventHandler1)">Online Documentation</a>
 */
 final   fun <TValue : Any>addGraphInputData( dataType: YClass<TValue> ,
 keyDefinitionPredicate: Predicate<Element> ,
 graphData: Action2<IGraph, TValue> ,
 deserializationCallback: EventHandler1<HandleDeserializationEventArgs>?  = definedExternally)
/**
 * Register `graphData` as an input data target for GraphML data that is present at the graph level.
 * @param [TValue] The type of the mapper values
 * @param [dataType] The type of the mapper values
 * @param [name] The name of the attribute
 * @param [graphData] Delegate that stores the graph data dynamically
 * @param [deserializationCallback] custom deserialization callback.
 * @param [uri] The optional URI of the key definition to disambiguate keys.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addGraphInputData(yfiles.lang.Class,string,system.Action2,system.EventHandler1,string)">Online Documentation</a>
 */
 final   fun <TValue : Any>addGraphInputData( dataType: YClass<TValue> ,
 name: String? ,
 graphData: Action2<IGraph, TValue> ,
 deserializationCallback: EventHandler1<HandleDeserializationEventArgs>?  = definedExternally,
 uri: String?  = definedExternally)
/**
 * Register `graphData` as an output data source for data that is written at the graph level.
 * @param [TValue] The type of the mapper values
 * @param [dataType] The type of the mapper values
 * @param [name] The name of the attribute
 * @param [graphData] the data that is written at the top level
 * @param [serializationCallback] custom serialization callback.
 * @param [declaredKeyType] The key type to write in the declaration. If this is omitted or `null`, the type is inferred automatically from `TValue`
 * @param [uri] The optional URI to add to the key definition to disambiguate keys.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addGraphOutputData(yfiles.lang.Class,string,TValue,system.EventHandler1,KeyType,string)">Online Documentation</a>
 */
 final   fun <TValue : Any>addGraphOutputData( dataType: YClass<TValue> ,
 name: String? ,
 graphData: TValue ,
 serializationCallback: EventHandler1<HandleSerializationEventArgs>?  = definedExternally,
 declaredKeyType: KeyType?  = definedExternally,
 uri: String?  = definedExternally)
/**
 * Register `graphData` as an output data source for data that is written at the graph level.
 * @param [TValue] The type of the mapper values
 * @param [dataType] The type of the mapper values
 * @param [name] The name of the attribute
 * @param [graphData] Delegate that retrieves the graph data dynamically
 * @param [serializationCallback] custom serialization callback.
 * @param [declaredKeyType] The key type to write in the declaration. If this is omitted or `null`, the type is inferred automatically from `TValue`
 * @param [uri] The optional URI to add to the key definition to disambiguate keys.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addGraphOutputData(yfiles.lang.Class,string,system.Func2,system.EventHandler1,KeyType,string)">Online Documentation</a>
 */
 final   fun <TValue : Any>addGraphOutputData( dataType: YClass<TValue> ,
 name: String? ,
 graphData: Func2<IGraph, TValue> ,
 serializationCallback: EventHandler1<HandleSerializationEventArgs>?  = definedExternally,
 declaredKeyType: KeyType?  = definedExternally,
 uri: String?  = definedExternally)
/**
 * Create a [Future] instance that wraps an [IInputHandler] that is dynamically created by `factory`.
 * @param [keyDefinitionPredicate] The predicate that matches the key definition.
 * @param [factory] A factory to create [IInputHandler] instances.
 * @return A [Future] instance that wraps an [IInputHandler] that actually parses the data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addInputHandlerFactory">Online Documentation</a>
 */
 final   fun addInputHandlerFactory( keyDefinitionPredicate: Predicate<Element> ,
 factory: IGenericInputHandlerFactory ):Future<IInputHandler>
/**
 * Register a [IMapper] instance for use as an input data target.
 * @param [TKey] The type of the mapper keys
 * @param [TData] The type of the mapper values
 * @param [keyType] The type of the mapper keys
 * @param [dataType] The type of the mapper values
 * @param [name] The name of the attribute
 * @param [mapper] the mapper that serves as data source
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addInputMapper(yfiles.lang.Class,yfiles.lang.Class,string,IMapper)">Online Documentation</a>
 */
 final   fun <TKey : Any, TData : Any>addInputMapper( keyType: YClass<TKey> ,
 dataType: YClass<TData> ,
 name: String ,
 mapper: IMapper<TKey, TData> )
/**
 * Register a [IMapper] instance for use as an input data target.
 * @param [TKey] The type of the mapper keys
 * @param [TData] The type of the mapper values
 * @param [keyType] The type of the mapper keys
 * @param [dataType] The type of the mapper values
 * @param [keyDefinitionPredicate] The predicate function that will determine whether to create an [IInputHandler] for the given key definition.
 * @param [mapper] the mapper that serves as data source
 * @param [deserializationCallback] custom deserialization callback.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addInputMapper(yfiles.lang.Class,yfiles.lang.Class,system.Predicate,IMapper,system.EventHandler1)">Online Documentation</a>
 */
 final   fun <TKey : Any, TData : Any>addInputMapper( keyType: YClass<TKey> ,
 dataType: YClass<TData> ,
 keyDefinitionPredicate: Predicate<Element> ,
 mapper: IMapper<TKey, TData> ,
 deserializationCallback: EventHandler1<HandleDeserializationEventArgs>? )
/**
 * Create a [Future] instance that wraps an [IMapper] for use as an input data target.
 * @param [TKey] The type of the mapper keys
 * @param [TData] The type of the mapper values
 * @param [keyType] The type of the mapper keys
 * @param [dataType] The type of the mapper values
 * @param [name] The name of the attribute
 * @return A [Future] instance that wraps an [IMapper] that actually holds the data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addInputMapperFuture(yfiles.lang.Class,yfiles.lang.Class,string)">Online Documentation</a>
 */
 final   fun <TKey : Any, TData : Any>addInputMapperFuture( keyType: YClass<TKey> ,
 dataType: YClass<TData> ,
 name: String ):Future<IMapper<TKey, TData>>
/**
 * Create a [Future] instance that wraps an [IMapper] for use as an input data target.
 * @param [TKey] The type of the mapper keys
 * @param [TData] The type of the mapper values
 * @param [keyType] The type of the mapper keys
 * @param [dataType] The type of the mapper values
 * @param [keyDefinitionPredicate] The predicate function that will determine whether to create an [IInputHandler] for the given key definition.
 * @param [deserializationCallback] custom deserialization callback.
 * @return A [Future] instance that wraps an [IMapper] that actually holds the data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addInputMapperFuture(yfiles.lang.Class,yfiles.lang.Class,system.Predicate,system.EventHandler1)">Online Documentation</a>
 */
 final   fun <TKey : Any, TData : Any>addInputMapperFuture( keyType: YClass<TKey> ,
 dataType: YClass<TData> ,
 keyDefinitionPredicate: Predicate<Element> ,
 deserializationCallback: EventHandler1<HandleDeserializationEventArgs>? ):Future<IMapper<TKey, TData>>
/**
 * Adds a namespace to the header of a GraphML file.
 * @param [namespaceURI] The namespace URI
 * @param [shortName] The namespace prefix
 * @throws ArgumentError If `namespaceURI` is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addNamespace">Online Documentation</a>
 */
 open   fun addNamespace( namespaceURI: String ,
 shortName: String? )
/**
 * Register a [IMapper] instance for use as an output data source
 * @param [TModelItem] The type of the mapper keys
 * @param [TValue] The type of the mapper values
 * @param [modelItemType] The type of the mapper keys
 * @param [dataType] The type of the mapper values
 * @param [name] The name of the attribute
 * @param [mapper] the mapper that serves as data source
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addOutputMapper(yfiles.lang.Class,yfiles.lang.Class,string,IMapper)">Online Documentation</a>
 */
 final   fun <TModelItem : IModelItem, TValue : Any>addOutputMapper( modelItemType: YClass<TModelItem> ,
 dataType: YClass<TValue> ,
 name: String? ,
 mapper: IMapper<TModelItem, TValue> )
/**
 * Register a [IMapper] instance for use as an output data source.
 * @param [TModelItem] The type of the mapper keys
 * @param [TValue] The type of the mapper values
 * @param [modelItemType] The type of the mapper keys
 * @param [dataType] The type of the mapper values
 * @param [name] The name of the attribute
 * @param [uri] The URI to add to the key definition to disambiguate keys.
 * @param [mapper] the mapper that serves as data source
 * @param [serializationCallback] custom serialization callback.
 * @param [declaredKeyType] The key type to write in the declaration.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addOutputMapper(yfiles.lang.Class,yfiles.lang.Class,string,string,IMapper,system.EventHandler1,KeyType)">Online Documentation</a>
 */
 final   fun <TModelItem : IModelItem, TValue : Any>addOutputMapper( modelItemType: YClass<TModelItem> ,
 dataType: YClass<TValue> ,
 name: String? ,
 uri: String? ,
 mapper: IMapper<TModelItem, TValue> ,
 serializationCallback: EventHandler1<HandleSerializationEventArgs>? ,
 declaredKeyType: KeyType )
/**
 * Create a [Future] instance that wraps an [IInputHandler] that stores the data in an [IMapper] that will be [created][createMapper] in the graph's [IMapperRegistry][yfiles.graph.IMapperRegistry].
 * @param [name] The name of the GraphML attribute and the key in the [IMapperRegistry][yfiles.graph.IMapperRegistry].
 * @return A [Future] instance that wraps an [IMapper] that actually holds the data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addRegistryInputMapper(yfiles.lang.Class,yfiles.lang.Class,string)">Online Documentation</a>
 */
 final   fun <TKey : Any, TData : Any>addRegistryInputMapper( keyType: YClass<TKey> ,
 dataType: YClass<TData> ,
 name: String ):Future<IMapper<TKey, TData>>
/**
 * Create a [Future] instance that wraps an [IInputHandler] that stores the data in an [IMapper] that will be [created][createMapper] in the graph's [IMapperRegistry][yfiles.graph.IMapperRegistry].
 * @param [tag] The name of the key in the [IMapperRegistry][yfiles.graph.IMapperRegistry].
 * @param [keyDefinitionPredicate] A predicate to determine whether the key definition is valid.
 * @param [deserializationCallback] The custom deserialization callback, can be `null` which will result in default deserialization.
 * @return A [Future] instance that wraps an [IMapper] that actually holds the data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addRegistryInputMapper(yfiles.lang.Class,yfiles.lang.Class,Object,system.Predicate,system.EventHandler1)">Online Documentation</a>
 */
 final   fun <TKey : Any, TData : Any>addRegistryInputMapper( keyType: YClass<TKey> ,
 dataType: YClass<TData> ,
 tag: DataTag<*,  TData> ,
 keyDefinitionPredicate: Predicate<Element> ,
 deserializationCallback: EventHandler1<HandleDeserializationEventArgs>? ):Future<IMapper<TKey, TData>>
/**
 * Use a registered [IMapper] instance as source for the given GraphML attribute.
 * @param [name] The GraphML name of the attribute
 * @param [tag] The tag name of the mapper in the [IMapperRegistry][yfiles.graph.IMapperRegistry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addRegistryOutputMapper(string,Object)">Online Documentation</a>
 */
 final   fun addRegistryOutputMapper( name: String? ,
 tag: DataTag<*,  *> )
/**
 * Use a registered [IMapper] instance as source for the given GraphML attribute.
 * @param [name] The GraphML name of the attribute
 * @param [uri] The optional URI of the attribute
 * @param [tag] The tag name of the mapper in the [IMapperRegistry][yfiles.graph.IMapperRegistry]
 * @param [serializationCallback] An optional serialization handler
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addRegistryOutputMapper(string,string,Object,system.EventHandler1)">Online Documentation</a>
 */
 final   fun addRegistryOutputMapper( name: String? ,
 uri: String? ,
 tag: DataTag<*,  *> ,
 serializationCallback: EventHandler1<HandleSerializationEventArgs>? )
/**
 * Use a registered [IMapper] instance as source for the given GraphML attribute.
 * @param [name] The GraphML name of the attribute
 * @param [tag] The tag name of the mapper in the [IMapperRegistry][yfiles.graph.IMapperRegistry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addRegistryOutputMapper(yfiles.lang.Class,yfiles.lang.Class,string,Object)">Online Documentation</a>
 */
 final   fun <TModelItem : IModelItem, TValue : Any>addRegistryOutputMapper( modelItemType: YClass<TModelItem> ,
 valueType: YClass<TValue> ,
 name: String? ,
 tag: DataTag<*,  TValue> )
/**
 * Use a registered [IMapper] instance as source for the given GraphML attribute.
 * @param [name] The GraphML name of the attribute
 * @param [uri] The URI to add to the key definition to disambiguate keys.
 * @param [tag] The tag name of the mapper in the [IMapperRegistry][yfiles.graph.IMapperRegistry]
 * @param [serializationCallback] custom serialization callback.
 * @param [declaredKeyType] The key type to write in the declaration.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addRegistryOutputMapper(yfiles.lang.Class,yfiles.lang.Class,string,string,Object,system.EventHandler1,KeyType)">Online Documentation</a>
 */
 final   fun <TModelItem : IModelItem, TValue : Any>addRegistryOutputMapper( modelItemType: YClass<TModelItem> ,
 valueType: YClass<TValue> ,
 name: String? ,
 uri: String? ,
 tag: DataTag<*,  TValue> ,
 serializationCallback: EventHandler1<HandleSerializationEventArgs>? ,
 declaredKeyType: KeyType )
/**
 * Adds a schema location to the header of a GraphML file.
 * @param [schemaNamespace] The namespace URI for this schema location
 * @param [schemaLocation] The schema location
 * @throws ArgumentError If `schemaNamespace` is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addSchemaLocation">Online Documentation</a>
 */
 open   fun addSchemaLocation( schemaNamespace: String ,
 schemaLocation: String? )
/**
 * Add a namespace mapping between an XML namespace and a JavaScript `module`.
 * @param [xmlNamespace] The XML namespace that corresponds to `module`.
 * @param [module] The module that is mapped to the XML namespace. The keys are the names of the XML tags. The values are the types.
 * @see [IXamlNameMapper]
 * @see [createXamlNameMapper]
 * @see [addXamlNamespaceMapping]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addXamlNamespaceMapping(string,Object)">Online Documentation</a>
 */
 final   fun addXamlNamespaceMapping( xmlNamespace: String ,
 module: Any )
/**
 * Add a namespace mapping between a fully qualified XML name (consisting of `xmlNamespace` and `tagName`) and a type.
 * @param [xmlNamespace] The XML namespace that corresponds to `type`. If `null`, the namespace will be determined based on the JavaScript module that contains `type`
 * @param [tagName] The XML tag name that corresponds to `type`. If `null`, the name will be determined from the type name automatically.
 * @param [type] The type that is mapped to the fully qualified XML name.
 * @see [IXamlNameMapper]
 * @see [createXamlNameMapper]
 * @see [addXamlNamespaceMapping]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-addXamlNamespaceMapping(string,string,yfiles.lang.Class)">Online Documentation</a>
 */
 final   fun addXamlNamespaceMapping( xmlNamespace: String? ,
 tagName: String? ,
 type: YClass<*> )
/**
 * Configure the predefined handlers for the [GraphMLParser.HandleDeserialization] event.
 * @param [graph] The graph that will be parsed.
 * @param [parser] The parser to configure.
 * @see [handlePrimitivesDeserialization]
 * @see [handleXamlDeserialization]
 * @see [handleTextNodeDeserialization]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureDeserializationHandlers">Online Documentation</a>
 */
 open protected   fun configureDeserializationHandlers( graph: IGraph ,
 parser: GraphMLParser )
/**
 * Configures the [deserialization property overrides][deserializationPropertyOverrides] for the given parser.
 * @param [parser] The parser to set the deserialization properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureDeserializationPropertyOverrides">Online Documentation</a>
 */
 open protected   fun configureDeserializationPropertyOverrides( parser: GraphMLParser )
/**
 * Configures a given instance of [GraphMLParser] that can handle the given graph.
 * @param [parser] The parser to configure
 * @param [graph] The graph that should be filled by the parser
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureGraphMLParser">Online Documentation</a>
 */
 open protected   fun configureGraphMLParser( parser: GraphMLParser ,
 graph: IGraph )
/**
 * Configures a given [GraphMLWriter] that is used for writing `graph`.
 * @param [writer] The writer to configure
 * @param [graph] The graph that will be written.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureGraphMLWriter">Online Documentation</a>
 */
 open protected   fun configureGraphMLWriter( writer: GraphMLWriter ,
 graph: IGraph )
/**
 * Configures default event handlers for the [GraphMLParser.QueryInputHandlers] event.
 * @param [parser] The parser that should be configured.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureInputHandlers">Online Documentation</a>
 */
 open protected   fun configureInputHandlers( parser: GraphMLParser )
/**
 * Configures `writer` to use the namespace declarations set with [addNamespace].
 * @param [writer] The writer to configure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureNamespaces">Online Documentation</a>
 */
 open protected   fun configureNamespaces( writer: GraphMLWriter )
/**
 * Configures default event handlers for the [GraphMLWriter.QueryOutputHandlers] event.
 * @param [graph] The graph that will be written.
 * @param [writer] The writer that should be configured.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureOutputHandlers">Online Documentation</a>
 */
 open protected   fun configureOutputHandlers( graph: IGraph ,
 writer: GraphMLWriter )
/**
 * Configures the lookup of the given parser.
 * @param [parser] The parser to configure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureParserLookup">Online Documentation</a>
 */
 open protected   fun configureParserLookup( parser: GraphMLParser )
/**
 * Configures `writer` to use the schema locations set with [addSchemaLocation].
 * @param [writer] The writer to configure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureSchemaLocations">Online Documentation</a>
 */
 open protected   fun configureSchemaLocations( writer: GraphMLWriter )
/**
 * Configures the predefined handlers for the [GraphMLWriter.HandleSerialization] event.
 * @param [graph] The graph that will be written.
 * @param [writer] The writer to configure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureSerializationHandlers">Online Documentation</a>
 */
 open protected   fun configureSerializationHandlers( graph: IGraph ,
 writer: GraphMLWriter )
/**
 * Configure important serialization properties from properties of [GraphMLIOHandler].
 * @param [graph] The graph to write.
 * @param [writer] The writer to configure.
 * @see [GraphMLWriter.setSerializationProperty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureSerializationProperties">Online Documentation</a>
 */
 open protected   fun configureSerializationProperties( graph: IGraph ,
 writer: GraphMLWriter )
/**
 * Configures the [serialization property overrides][serializationPropertyOverrides] for the given writer.
 * @param [writer] The writer to set the serialization properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureSerializationPropertyOverrides">Online Documentation</a>
 */
 open protected   fun configureSerializationPropertyOverrides( writer: GraphMLWriter )
/**
 * Configure the lookup map of `writer`.
 * @param [graph] The graph that will be written.
 * @param [writer] The writer to configure.
 * @see [GraphMLWriter.setLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureWriterLookup">Online Documentation</a>
 */
 open protected   fun configureWriterLookup( graph: IGraph ,
 writer: GraphMLWriter )
/**
 * Configure `writer`.
 * @param [writer] The writer to configure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-configureXMLWriter">Online Documentation</a>
 */
 open protected   fun configureXMLWriter( writer: IXmlWriter )
/**
 * Creates the default value serializer context and returns it.
 * @return An implementation of the [IValueSerializerContext] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createDefaultValueSerializerContext">Online Documentation</a>
 */
 open protected   fun createDefaultValueSerializerContext():IValueSerializerContext
/**
 * Create an [IGraphElementFactory] instance that creates the graph elements for the `graph` instance.
 * @param [parser] The parser to use.
 * @param [graph] The graph that is populated.
 * @return An [IGraphElementFactory] instance that is configured for the given parameters.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createGraphElementFactory">Online Documentation</a>
 */
 open protected   fun createGraphElementFactory( parser: GraphMLParser ,
 graph: IGraph ):IGraphElementFactory
/**
 * Create a suitable instance of [GraphMLParser] that can handle the given graph.
 * @param [graph] The graph that should be filled by this instance
 * @return a suitable instance of [GraphMLParser] that can handle the given graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createGraphMLParser">Online Documentation</a>
 */
 open protected   fun createGraphMLParser( graph: IGraph ):GraphMLParser
/**
 * Create and configure a new [GraphMLWriter] that is used for writing `graph`.
 * @param [graph] The graph that will be written.
 * @return A new [GraphMLWriter] instance that is configured for `graph`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createGraphMLWriter">Online Documentation</a>
 */
 open protected   fun createGraphMLWriter( graph: IGraph ):GraphMLWriter
/**
 * Called by [addRegistryInputMapper] and its overloads to creates the mapper instance.
 * @param [TKey] The type of the keys.
 * @param [TData] The type of the data.
 * @param [keyType] The type of the keys.
 * @param [dataType] The type of the data.
 * @param [registryTag] The tag for the mapper in the registry.
 * @return The mapper instance to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createMapper">Online Documentation</a>
 */
 open protected   fun <TKey : Any, TData : Any>createMapper( keyType: YClass<TKey> ,
 dataType: YClass<TData> ,
 context: IParseContext ,
 registryTag: DataTag<*,  TData> ):IMapper<TKey, TData>
/**
 * Factory method that creates and configures a suitable [IXmlWriter] implementation.
 * @return A suitable [IXmlWriter] instance for the serialization
 * @see [IWriteContext.writer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createXMLWriter">Online Documentation</a>
 */
 open protected   fun createXMLWriter():IXmlWriter
/**
 * Configure mappings from CLR to XML names.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createXamlNameMapper">Online Documentation</a>
 */
 open protected   fun createXamlNameMapper():IXamlNameMapper?
/**
 * Configure mappings from XML namespaces to prefixes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createXamlPrefixMapper">Online Documentation</a>
 */
 open protected   fun createXamlPrefixMapper():IXamlPrefixMapper
/**
 * Handle the serialization of arrays.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleArraySerialization">Online Documentation</a>
 */
 open protected   fun handleArraySerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handle the serialization for enums.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleEnumSerialization">Online Documentation</a>
 */
 open protected   fun handleEnumSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handler for the [GraphMLParser.HandleDeserialization] event.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleJSONDeserialization">Online Documentation</a>
 */
 open protected   fun handleJSONDeserialization( sender: IEventDispatcher ,
 event: HandleDeserializationEventArgs )
/**
 * Handle the serialization of plain JavaScript object that can be serialized to JSON.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleJSONSerialization">Online Documentation</a>
 */
 open protected   fun handleJSONSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handle the serialization of [IEnumerable][yfiles.collections.IEnumerable] instances.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleListSerialization">Online Documentation</a>
 */
 open protected   fun handleListSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handle the serialization of [MarkupExtension] convertible instances.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleMarkupExtensionBasedSerialization">Online Documentation</a>
 */
 open protected   fun handleMarkupExtensionBasedSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handle the serialization of `null` references.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleNullSerialization">Online Documentation</a>
 */
 open protected   fun handleNullSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handle the serialization of primitive types, enums and strings.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handlePrimitivesDeserialization">Online Documentation</a>
 */
 open protected   fun handlePrimitivesDeserialization( sender: IEventDispatcher ,
 event: HandleDeserializationEventArgs )
/**
 * Handle the serialization of primitive types, enums and strings.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handlePrimitivesSerialization">Online Documentation</a>
 */
 open protected   fun handlePrimitivesSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handle the serialization of [IReferenceHandle] instances.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleReferenceHandleSerialization">Online Documentation</a>
 */
 open protected   fun handleReferenceHandleSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handle the serialization of instances that can be serialized through a [ValueSerializer].
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleTextConvertibleSerialization">Online Documentation</a>
 */
 open protected   fun handleTextConvertibleSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handler for the [GraphMLParser.HandleDeserialization] event.
 * @param [source] The source of the event.
 * @param [event] The event arguments.
 * @see [HandleDeserializationEventArgs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleTextNodeDeserialization">Online Documentation</a>
 */
 open protected   fun handleTextNodeDeserialization( source: IEventDispatcher ,
 event: HandleDeserializationEventArgs )
/**
 * Handle the serialization of TypeExtensions.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleTypeExtensionSerialization">Online Documentation</a>
 */
 open protected   fun handleTypeExtensionSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handle the serialization of Types.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleTypeSerialization">Online Documentation</a>
 */
 open protected   fun handleTypeSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handle the serialization of `undefined` references.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleUndefinedSerialization">Online Documentation</a>
 */
 open protected   fun handleUndefinedSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Handler for the [GraphMLParser.HandleDeserialization] event.
 * @param [source] The source of the event.
 * @param [event] The event arguments.
 * @see [HandleDeserializationEventArgs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleXamlDeserialization">Online Documentation</a>
 */
 open protected   fun handleXamlDeserialization( source: IEventDispatcher ,
 event: HandleDeserializationEventArgs )
/**
 * Handle the serialization of complex objects that are not handled by other callbacks.
 * @param [sender] The origin of the event.
 * @param [event] The event handler arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-handleXamlSerialization">Online Documentation</a>
 */
 open protected   fun handleXamlSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Event handler for the [GraphMLParser.HandleDeserialization] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onGraphMLParserHandleDeserialization">Online Documentation</a>
 */
 open protected   fun onGraphMLParserHandleDeserialization( sender: IEventDispatcher ,
 event: HandleDeserializationEventArgs )
/**
 * Event handler for the [GraphMLParser.QueryInputHandlers] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onGraphMLParserQueryInputHandlers">Online Documentation</a>
 */
 open protected   fun onGraphMLParserQueryInputHandlers( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Event handler for the [GraphMLWriter.HandleSerialization] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onGraphMLWriterHandleSerialization">Online Documentation</a>
 */
 open protected   fun onGraphMLWriterHandleSerialization( sender: IEventDispatcher ,
 event: HandleSerializationEventArgs )
/**
 * Event handler for the [GraphMLWriter.QueryOutputHandlers] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onGraphMLWriterQueryOutputHandlers">Online Documentation</a>
 */
 open protected   fun onGraphMLWriterQueryOutputHandlers( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Raises the [HandleDeserialization] event.
 * @param [event] The arguments for the [HandleDeserialization] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onHandleDeserialization">Online Documentation</a>
 */
 open protected   fun onHandleDeserialization( event: HandleDeserializationEventArgs )
/**
 * Raises the [HandleSerialization] event.
 * @param [event] The arguments for the [HandleSerialization] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onHandleSerialization">Online Documentation</a>
 */
 open protected   fun onHandleSerialization( event: HandleSerializationEventArgs )
/**
 * Fires the [OverrideResolveReference] event.
 * @param [event] The arguments that get passed to the [OverrideResolveReference] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onOverrideResolveReference">Online Documentation</a>
 */
 open protected   fun onOverrideResolveReference( event: ResolveReferenceEventArgs )
/**
 * Raises the [Parsed] event.
 * @param [event] The [ParseEventArgs] instance containing the event data.
 * @see [addParsedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onParsed">Online Documentation</a>
 */
 open protected   fun onParsed( event: ParseEventArgs )
/**
 * Raises the [Parsing] event.
 * @param [event] The [ParseEventArgs] instance containing the event data.
 * @see [addParsingListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onParsing">Online Documentation</a>
 */
 open protected   fun onParsing( event: ParseEventArgs )
/**
 * Raises the [QueryInputHandlers] event.
 * @param [event] The arguments for the [QueryInputHandlers] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onQueryInputHandlers">Online Documentation</a>
 */
 open protected   fun onQueryInputHandlers( event: QueryInputHandlersEventArgs )
/**
 * Raises the [QueryOutputHandlers] event.
 * @param [event] The arguments for the [QueryOutputHandlers] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onQueryOutputHandlers">Online Documentation</a>
 */
 open protected   fun onQueryOutputHandlers( event: QueryOutputHandlersEventArgs )
/**
 * Fires the [QueryReferenceId] event.
 * @param [event] The arguments that get passed to the [QueryReferenceId] event.
 * @throws ArgumentError `args` is null.
 * @see [GraphMLWriter.onQueryReferenceId]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onQueryReferenceId">Online Documentation</a>
 */
 open protected   fun onQueryReferenceId( event: QueryReferenceIdEventArgs )
/**
 * Fires the [ResolveReference] event.
 * @param [event] The arguments that get passed to the [ResolveReference] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onResolveReference">Online Documentation</a>
 */
 open protected   fun onResolveReference( event: ResolveReferenceEventArgs )
/**
 * Raises the [Writing] event.
 * @param [event] The [WriteEventArgs] instance containing the event data.
 * @see [addWritingListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onWriting">Online Documentation</a>
 */
 open protected   fun onWriting( event: WriteEventArgs )
/**
 * Raises the [Written] event.
 * @param [event] The [WriteEventArgs] instance containing the event data.
 * @see [addWrittenListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-onWritten">Online Documentation</a>
 */
 open protected   fun onWritten( event: WriteEventArgs )
/**
 * Read GraphML from an existing XML document.
 * @param [graph] The graph that is to be populated with nodes and edges as read from the document.
 * @param [document] The XML document. **Note**: If you are using Internet Explorer 9 and [XMLHttpRequest]s to retrieve the document, you may not use the value from the [XMLHttpRequest.responseXML] property. Please parse [XMLHttpRequest.responseText] instead and use the result. For further reference see <a href="https://docs.microsoft.com/en-us/previous-versions/windows/internet-explorer/ie-developer/compatibility/hh180177(v=vs.85)">https://docs.microsoft.com/en-us/previous-versions/windows/internet-explorer/ie-developer/compatibility/hh180177(v=vs.85)</a>.
 * @throws ArgumentError `document` is null.
 * @throws ArgumentError `graph` is null.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-readFromDocument">Online Documentation</a>
 */
 open   fun readFromDocument( graph: IGraph ,
 document: Document ):Promise<IGraph>
/**
 * Convenience method that imports the `graph` from an XML data provided in a string `data`.
 * @param [graph] The Graph object that is to be populated with nodes and edges as read from the GraphML data.
 * @param [data] A string that contains GraphML data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-readFromGraphMLText">Online Documentation</a>
 */
 open   fun readFromGraphMLText( graph: IGraph ,
 data: String ):Promise<IGraph>
/**
 * Reads GraphML content from the given `url` and populates the `graph`.
 * @param [graph] The graph that is to be populated with nodes and edges as read from the URL.
 * @param [url] The URL of the file to be read.
 * @throws ArgumentError `url` is null.
 * @throws ArgumentError `graph` is null.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-readFromURL">Online Documentation</a>
 */
 open   fun readFromURL( graph: IGraph ,
 url: String ):Promise<IGraph>
/**
 * Predefined input handler that reads edge bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerEdgeBendsInputHandler">Online Documentation</a>
 */
 open protected   fun registerEdgeBendsInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes edge bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerEdgeBendsOutputHandler">Online Documentation</a>
 */
 open protected   fun registerEdgeBendsOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Predefined input handler that reads edge labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerEdgeLabelsInputHandler">Online Documentation</a>
 */
 open protected   fun registerEdgeLabelsInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes edge labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerEdgeLabelsOutputHandler">Online Documentation</a>
 */
 open protected   fun registerEdgeLabelsOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Predefined input handler that reads edge styles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerEdgeStyleInputHandler">Online Documentation</a>
 */
 open protected   fun registerEdgeStyleInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes edge styles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerEdgeStyleOutputHandler">Online Documentation</a>
 */
 open protected   fun registerEdgeStyleOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Predefined input handler that reads [IGraph] graph default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerGraphSettingsInputHandler">Online Documentation</a>
 */
 open protected   fun registerGraphSettingsInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes the settings of a graph.
 * @see [SerializationProperties.DISABLE_GRAPH_SETTINGS]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerGraphSettingsOutputHandler">Online Documentation</a>
 */
 open protected   fun registerGraphSettingsOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Predefined input handler that reads node labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerNodeLabelsInputHandler">Online Documentation</a>
 */
 open protected   fun registerNodeLabelsInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes node labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerNodeLabelsOutputHandler">Online Documentation</a>
 */
 open protected   fun registerNodeLabelsOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Predefined input handler that reads node layouts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerNodeLayoutInputHandler">Online Documentation</a>
 */
 open protected   fun registerNodeLayoutInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes node layouts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerNodeLayoutOutputHandler">Online Documentation</a>
 */
 open protected   fun registerNodeLayoutOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Predefined input handler that reads node styles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerNodeStyleInputHandler">Online Documentation</a>
 */
 open protected   fun registerNodeStyleInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes node styles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerNodeStyleOutputHandler">Online Documentation</a>
 */
 open protected   fun registerNodeStyleOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Predefined input handler that reads port labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerPortLabelsInputHandler">Online Documentation</a>
 */
 open protected   fun registerPortLabelsInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes port labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerPortLabelsOutputHandler">Online Documentation</a>
 */
 open protected   fun registerPortLabelsOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Predefined input handler that reads port locations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerPortLocationInputHandler">Online Documentation</a>
 */
 open protected   fun registerPortLocationInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes port locations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerPortLocationOutputHandler">Online Documentation</a>
 */
 open protected   fun registerPortLocationOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Predefined input handler that reads port styles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerPortStyleInputHandler">Online Documentation</a>
 */
 open protected   fun registerPortStyleInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes port styles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerPortStyleOutputHandler">Online Documentation</a>
 */
 open protected   fun registerPortStyleOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Predefined input handler that reads [ITagOwner][yfiles.graph.ITagOwner] tags.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerTagInputHandler">Online Documentation</a>
 */
 open protected   fun registerTagInputHandler( sender: IEventDispatcher ,
 event: QueryInputHandlersEventArgs )
/**
 * Predefined output handler that writes [ITagOwner][yfiles.graph.ITagOwner] tags.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-registerTagOutputHandler">Online Documentation</a>
 */
 open protected   fun registerTagOutputHandler( sender: IEventDispatcher ,
 event: QueryOutputHandlersEventArgs )
/**
 * Writes the given graph object to a GraphML file.
 * @param [graph] The Graph object that is to be written to a GraphML file.
 * @return A string containing the GraphML data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-write">Online Documentation</a>
 */
 open   fun write( graph: IGraph ):Promise<String>
/**
 * Occurs before inline references are evaluated.
 * @see [addResolveReferenceListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23OverrideResolveReference">Online Documentation</a>
 */
fun addOverrideResolveReferenceListener(listener: EventHandler1<ResolveReferenceEventArgs>)
fun removeOverrideResolveReferenceListener(listener: EventHandler1<ResolveReferenceEventArgs>)

/**
 * Occurs after references are evaluated.
 * @see [addOverrideResolveReferenceListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23ResolveReference">Online Documentation</a>
 */
fun addResolveReferenceListener(listener: EventHandler1<ResolveReferenceEventArgs>)
fun removeResolveReferenceListener(listener: EventHandler1<ResolveReferenceEventArgs>)

/**
 * Occurs when a reference is queried.
 * @see [QueryReferenceIdEventArgs.referenceId]
 * @see [QueryReferenceIdEventArgs.referenceType]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23QueryReferenceId">Online Documentation</a>
 */
fun addQueryReferenceIdListener(listener: EventHandler1<QueryReferenceIdEventArgs>)
fun removeQueryReferenceIdListener(listener: EventHandler1<QueryReferenceIdEventArgs>)

/**
 * Occurs when the writing of a document has been finished.
 * @see [onWritten]
 * @see [GraphMLWriter.addWrittenListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23Written">Online Documentation</a>
 */
fun addWrittenListener(listener: EventHandler1<WriteEventArgs>)
fun removeWrittenListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs when the writing of a document is just about to begin.
 * @see [onWriting]
 * @see [GraphMLWriter.addWritingListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23Writing">Online Documentation</a>
 */
fun addWritingListener(listener: EventHandler1<WriteEventArgs>)
fun removeWritingListener(listener: EventHandler1<WriteEventArgs>)

/**
 * Occurs when a type is queried.
 * @see [QueryTypeEventArgs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23QueryType">Online Documentation</a>
 */
fun addQueryTypeListener(listener: EventHandler1<QueryTypeEventArgs>)
fun removeQueryTypeListener(listener: EventHandler1<QueryTypeEventArgs>)

/**
 * Occurs when a name is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23QueryName">Online Documentation</a>
 */
fun addQueryNameListener(listener: EventHandler1<QueryNameEventArgs>)
fun removeQueryNameListener(listener: EventHandler1<QueryNameEventArgs>)

/**
 * Occurs when XML content is about to be serialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23HandleSerialization">Online Documentation</a>
 */
fun addHandleSerializationListener(listener: EventHandler1<HandleSerializationEventArgs>)
fun removeHandleSerializationListener(listener: EventHandler1<HandleSerializationEventArgs>)

/**
 * Occurs when a GraphML attribute is about to be written.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23QueryOutputHandlers">Online Documentation</a>
 */
fun addQueryOutputHandlersListener(listener: EventHandler1<QueryOutputHandlersEventArgs>)
fun removeQueryOutputHandlersListener(listener: EventHandler1<QueryOutputHandlersEventArgs>)

/**
 * Occurs when the document has been parsed.
 * @see [onParsed]
 * @see [GraphMLParser.addParsedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23Parsed">Online Documentation</a>
 */
fun addParsedListener(listener: EventHandler1<ParseEventArgs>)
fun removeParsedListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when the parsing of a document is just about to begin.
 * @see [onParsing]
 * @see [GraphMLParser.addParsingListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23Parsing">Online Documentation</a>
 */
fun addParsingListener(listener: EventHandler1<ParseEventArgs>)
fun removeParsingListener(listener: EventHandler1<ParseEventArgs>)

/**
 * Occurs when a GraphML attribute is about to be read.
 * @see [GraphMLParser.addQueryInputHandlersListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23QueryInputHandlers">Online Documentation</a>
 */
fun addQueryInputHandlersListener(listener: EventHandler1<QueryInputHandlersEventArgs>)
fun removeQueryInputHandlersListener(listener: EventHandler1<QueryInputHandlersEventArgs>)

/**
 * Occurs when XML content is about to be deserialized.
 * @see [GraphMLParser.addHandleDeserializationListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23HandleDeserialization">Online Documentation</a>
 */
fun addHandleDeserializationListener(listener: EventHandler1<HandleDeserializationEventArgs>)
fun removeHandleDeserializationListener(listener: EventHandler1<HandleDeserializationEventArgs>)

companion object : ClassMetadata<GraphMLIOHandler> {
/**
 * Creates an [IInputHandler] implementations that matches the provided `TKey` and `TData`.
 * @param [TKey] The type of the mapper keys
 * @param [TData] The type of the mapper entries
 * @param [modelItemType] The type of the mapper keys
 * @param [dataType] The type of the mapper entries
 * @param [mapper] The mapper to use.
 * @param [deserializationCallback] Optional deserialization callback for complex data.
 * @return A suitable [MapperInputHandler] implementation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-createMapperInputHandler">Online Documentation</a>
 */
 final   fun <TKey : IModelItem, TData : Any>createMapperInputHandler( modelItemType: YClass<TKey> ,
 dataType: YClass<TData> ,
 mapper: IMapper<TKey, TData>? ,
 deserializationCallback: EventHandler1<HandleDeserializationEventArgs>? ):MapperInputHandler<TKey, TData>
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
 final   fun <TKey : IModelItem, TData : Any>createMapperOutputHandler( modelItemType: YClass<TKey> ,
 dataType: YClass<TData> ,
 name: String? ,
 mapper: IMapper<TKey, TData>? ,
 serializationCallback: EventHandler1<HandleSerializationEventArgs>? ):MapperOutputHandler<TKey, TData>
/**
 * Checks whether the `name` attribute in `definition` matches `name`
 * @param [definition] The key definition to check
 * @param [name] The name that should be matched
 * @return `true` if the name attribute in `definition` matches `name`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-matchesName">Online Documentation</a>
 */
 final   fun matchesName( definition: Element ,
 name: String? ):Boolean
/**
 * Checks whether the `scope` attribute in `definition` matches `scope`
 * @param [definition] The key definition to check
 * @param [scope] The scope that should be matched
 * @return `true` if the scope attribute in `definition` matches `scope`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-matchesScope">Online Documentation</a>
 */
 final   fun matchesScope( definition: Element ,
 scope: KeyScope ):Boolean
/**
 * Checks whether the `type` attribute in `definition` matches `type`
 * @param [definition] The key definition to check
 * @param [type] The type that should be matched
 * @return `true` if the type attribute in `definition` matches `type`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-matchesType">Online Documentation</a>
 */
 final   fun matchesType( definition: Element ,
 type: KeyType ):Boolean
/**
 * Checks whether the `uri` attribute in `definition` matches `uri`
 * @param [definition] The key definition to check
 * @param [uri] The uri that should be matched
 * @return `true` if the uri attribute in `definition` matches `uri`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23GraphMLIOHandler-method-matchesUri">Online Documentation</a>
 */
 final   fun matchesUri( definition: Element ,
 uri: String? ):Boolean
}
}

inline fun GraphMLIOHandler(
    block: GraphMLIOHandler.() -> Unit
): GraphMLIOHandler {
    return GraphMLIOHandler()
        .apply(block)
}

/**
 * Occurs before inline references are evaluated.
 * @see [addResolveReferenceListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23OverrideResolveReference">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addOverrideResolveReferenceHandler(
    crossinline handler: (event:ResolveReferenceEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ResolveReferenceEventArgs> = { _, event -> handler(event) }
    addOverrideResolveReferenceListener(listener)
    return { removeOverrideResolveReferenceListener(listener) }
}
/**
 * Occurs after references are evaluated.
 * @see [addOverrideResolveReferenceListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23ResolveReference">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addResolveReferenceHandler(
    crossinline handler: (event:ResolveReferenceEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ResolveReferenceEventArgs> = { _, event -> handler(event) }
    addResolveReferenceListener(listener)
    return { removeResolveReferenceListener(listener) }
}
/**
 * Occurs when a reference is queried.
 * @see [QueryReferenceIdEventArgs.referenceId]
 * @see [QueryReferenceIdEventArgs.referenceType]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23QueryReferenceId">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addQueryReferenceIdHandler(
    crossinline handler: (event:QueryReferenceIdEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryReferenceIdEventArgs> = { _, event -> handler(event) }
    addQueryReferenceIdListener(listener)
    return { removeQueryReferenceIdListener(listener) }
}
/**
 * Occurs when the writing of a document has been finished.
 * @see [onWritten]
 * @see [GraphMLWriter.addWrittenListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23Written">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addWrittenHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addWrittenListener(listener)
    return { removeWrittenListener(listener) }
}
/**
 * Occurs when the writing of a document is just about to begin.
 * @see [onWriting]
 * @see [GraphMLWriter.addWritingListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23Writing">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addWritingHandler(
    crossinline handler: (event:WriteEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<WriteEventArgs> = { _, event -> handler(event) }
    addWritingListener(listener)
    return { removeWritingListener(listener) }
}
/**
 * Occurs when a type is queried.
 * @see [QueryTypeEventArgs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23QueryType">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addQueryTypeHandler(
    crossinline handler: (event:QueryTypeEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryTypeEventArgs> = { _, event -> handler(event) }
    addQueryTypeListener(listener)
    return { removeQueryTypeListener(listener) }
}
/**
 * Occurs when a name is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23QueryName">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addQueryNameHandler(
    crossinline handler: (event:QueryNameEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryNameEventArgs> = { _, event -> handler(event) }
    addQueryNameListener(listener)
    return { removeQueryNameListener(listener) }
}
/**
 * Occurs when XML content is about to be serialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23HandleSerialization">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addHandleSerializationHandler(
    crossinline handler: (event:HandleSerializationEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<HandleSerializationEventArgs> = { _, event -> handler(event) }
    addHandleSerializationListener(listener)
    return { removeHandleSerializationListener(listener) }
}
/**
 * Occurs when a GraphML attribute is about to be written.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23QueryOutputHandlers">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addQueryOutputHandlersHandler(
    crossinline handler: (event:QueryOutputHandlersEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryOutputHandlersEventArgs> = { _, event -> handler(event) }
    addQueryOutputHandlersListener(listener)
    return { removeQueryOutputHandlersListener(listener) }
}
/**
 * Occurs when the document has been parsed.
 * @see [onParsed]
 * @see [GraphMLParser.addParsedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23Parsed">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addParsedHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addParsedListener(listener)
    return { removeParsedListener(listener) }
}
/**
 * Occurs when the parsing of a document is just about to begin.
 * @see [onParsing]
 * @see [GraphMLParser.addParsingListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23Parsing">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addParsingHandler(
    crossinline handler: (event:ParseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ParseEventArgs> = { _, event -> handler(event) }
    addParsingListener(listener)
    return { removeParsingListener(listener) }
}
/**
 * Occurs when a GraphML attribute is about to be read.
 * @see [GraphMLParser.addQueryInputHandlersListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23QueryInputHandlers">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addQueryInputHandlersHandler(
    crossinline handler: (event:QueryInputHandlersEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryInputHandlersEventArgs> = { _, event -> handler(event) }
    addQueryInputHandlersListener(listener)
    return { removeQueryInputHandlersListener(listener) }
}
/**
 * Occurs when XML content is about to be deserialized.
 * @see [GraphMLParser.addHandleDeserializationListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLIOHandler%23HandleDeserialization">Online Documentation</a>
 */
inline fun  GraphMLIOHandler.addHandleDeserializationHandler(
    crossinline handler: (event:HandleDeserializationEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<HandleDeserializationEventArgs> = { _, event -> handler(event) }
    addHandleDeserializationListener(listener)
    return { removeHandleDeserializationListener(listener) }
}
