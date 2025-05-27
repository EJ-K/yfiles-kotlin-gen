// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.algorithms.DpKeyBase
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.Graph
import yfiles.algorithms.GraphDpKey
import yfiles.algorithms.ILabelLayoutDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IEnumerable
import yfiles.collections.IMapper
import yfiles.collections.Mapper
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * A registry that can be used to store [IMapper] implementations by tag.
 * @see [MapperRegistry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry">Online Documentation</a>
 */
external interface IMapperRegistry : YObject {
/**
 * Gets an enumerable over all tags that have been used to register mapper implementations with this interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23registeredTags">Online Documentation</a>
 */
val registeredTags: IEnumerable<Any>
/**
 * Registers a mapper for the given tag.
 * @param [K] The key type for the mapper.
 * @param [V] The value type for the mapper.
 * @param [keyType] The key type for the mapper.
 * @param [valueType] The value type for the mapper.
 * @param [tag] The tag to use.
 * @param [mapper] The mapper to register.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-method-addMapper">Online Documentation</a>
 */
   fun <K : Any, V : Any>addMapper( keyType: YClass<K> ,
 valueType: YClass<V> ,
 tag: DpKeyBase<*, V> ,
 mapper: IMapper<K, V> )
/**
 * Creates a simple read-only [IMapper] implementation with key type [INode] and [adds][addMapper] it to the `registry` using the provided `tag`.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @param [constant] The value to yield during [IMapper] reads.
 * @return The newly created mapper instance.
 * @see [IMapper.fromDelegate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createConstantMapper(NodeDpKey,V)">Online Documentation</a>
 */
  final  fun <V : Any>createConstantMapper( tag: NodeDpKey<V> ,
 constant: V? ):IMapper<INode, V> = definedExternally
/**
 * Creates a simple read-only [IMapper] implementation with key type [IEdge] and [adds][addMapper] it to the `registry` using the provided `tag`.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @param [constant] The value to yield during [IMapper] reads.
 * @return The newly created mapper instance.
 * @see [IMapper.fromDelegate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createConstantMapper(EdgeDpKey,V)">Online Documentation</a>
 */
  final  fun <V : Any>createConstantMapper( tag: EdgeDpKey<V> ,
 constant: V? ):IMapper<IEdge, V> = definedExternally
/**
 * Creates a simple read-only [IMapper] implementation with key type [ILabel] and [adds][addMapper] it to the `registry` using the provided `tag`.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @param [constant] The value to yield during [IMapper] reads.
 * @return The newly created mapper instance.
 * @see [IMapper.fromDelegate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createConstantMapper(ILabelLayoutDpKey,V)">Online Documentation</a>
 */
  final  fun <V : Any>createConstantMapper( tag: ILabelLayoutDpKey<V> ,
 constant: V? ):IMapper<ILabel, V> = definedExternally
/**
 * Creates a read-only [IMapper] implementation and [adds][addMapper] it to the `registry` using the provided `tag`.
 * @param [K] The type of the keys of the mapper.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @param [constant] The value to yield during [IMapper] reads.
 * @return The newly created mapper instance.
 * @see [IMapper.fromConstant]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createConstantMapper(yfiles.lang.Class,yfiles.lang.Class,Object,V)">Online Documentation</a>
 */
  final  fun <K : Any, V : Any>createConstantMapper( keyType: YClass<K> ,
 valueType: YClass<V> ,
 tag: DpKeyBase<*, V> ,
 constant: V? ):IMapper<K, V> = definedExternally
/**
 * Creates a delegate-based read-only [IMapper] implementation with key type [INode] and [adds][addMapper] it to the `registry` using the provided `tag`.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @param [getter] The getter delegate to which [IMapper] reads will be delegated.
 * @return The newly created mapper instance.
 * @see [IMapper.fromDelegate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createDelegateMapper(NodeDpKey,MapperDelegate)">Online Documentation</a>
 */
  final  fun <V : Any>createDelegateMapper( tag: NodeDpKey<V> ,
 getter: MapperDelegate<INode, V> ):IMapper<INode, V> = definedExternally
/**
 * Creates a delegate-based read-only [IMapper] implementation with key type [IEdge] and [adds][addMapper] it to the `registry` using the provided `tag`.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @param [getter] The getter delegate to which [IMapper] reads will be delegated.
 * @return The newly created mapper instance.
 * @see [IMapper.fromDelegate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createDelegateMapper(EdgeDpKey,MapperDelegate)">Online Documentation</a>
 */
  final  fun <V : Any>createDelegateMapper( tag: EdgeDpKey<V> ,
 getter: MapperDelegate<IEdge, V> ):IMapper<IEdge, V> = definedExternally
/**
 * Creates a delegate-based read-only [IMapper] implementation with key type [ILabel] and [adds][addMapper] it to the `registry` using the provided `tag`.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @param [getter] The getter delegate to which [IMapper] reads will be delegated.
 * @return The newly created mapper instance.
 * @see [IMapper.fromDelegate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createDelegateMapper(ILabelLayoutDpKey,MapperDelegate)">Online Documentation</a>
 */
  final  fun <V : Any>createDelegateMapper( tag: ILabelLayoutDpKey<V> ,
 getter: MapperDelegate<ILabel, V> ):IMapper<ILabel, V> = definedExternally
/**
 * Creates a delegate-based read-only [IMapper] implementation and [adds][addMapper] it to the `registry` using the provided `tag`.
 * @param [K] The type of the keys of the mapper.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @param [getter] The getter delegate to which [IMapper] reads will be delegated.
 * @return The newly created mapper instance.
 * @see [IMapper.fromDelegate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createDelegateMapper(yfiles.lang.Class,yfiles.lang.Class,Object,MapperDelegate)">Online Documentation</a>
 */
  final  fun <K : Any, V : Any>createDelegateMapper( keyType: YClass<K> ,
 valueType: YClass<V> ,
 tag: DpKeyBase<*, V> ,
 getter: MapperDelegate<K, V> ):IMapper<K, V> = definedExternally
/**
 * Creates and [adds][addMapper] a new [Mapper] with key type [INode] to the `registry` using the provided `tag`.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @return The newly created mapper instance.
 * @see [Mapper]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createMapper(NodeDpKey)">Online Documentation</a>
 */
  final  fun <V : Any>createMapper( tag: NodeDpKey<V> ):Mapper<INode, V> = definedExternally
/**
 * Creates and [adds][addMapper] a new [Mapper] with key type [ILabel] to the `registry` using the provided `tag`.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @return The newly created mapper instance.
 * @see [Mapper]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createMapper(ILabelLayoutDpKey)">Online Documentation</a>
 */
  final  fun <V : Any>createMapper( tag: ILabelLayoutDpKey<V> ):Mapper<ILabel, V> = definedExternally
/**
 * Creates and [adds][addMapper] a new [Mapper] with key type [IEdge] to the `registry` using the provided `tag`.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @return The newly created mapper instance.
 * @see [Mapper]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createMapper(EdgeDpKey)">Online Documentation</a>
 */
  final  fun <V : Any>createMapper( tag: EdgeDpKey<V> ):Mapper<IEdge, V> = definedExternally
/**
 * Creates and [adds][addMapper] a new [Mapper] to the `registry` using the provided `tag`.
 * @param [K] The type of the keys of the mapper.
 * @param [V] The type of the values of the mapper.
 * @param [tag] The tag.
 * @return The newly created mapper instance.
 * @see [Mapper]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-defaultmethod-createMapper(yfiles.lang.Class,yfiles.lang.Class,Object)">Online Documentation</a>
 */
  final  fun <K : Any, V : Any>createMapper( keyType: YClass<K> ,
 valueType: YClass<V> ,
 tag: DpKeyBase<*, V> ):Mapper<K, V> = definedExternally
/**
 * Returns a mapper that has previously been registered with this instance for the given tag.
 * @param [K] The key type for the mapper.
 * @param [V] The value type for the mapper.
 * @param [tag] The tag to use to look up the mapper.
 * @return The previously registered instance or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-method-getMapper">Online Documentation</a>
 */
   fun <K : Any, V : Any>getMapper( tag: DpKeyBase<*, V> ):IMapper<K, V>?
/**
 * Gets the mapper [meta data][MapperMetadata] for the mapper that is registered using the `tag`.
 * @param [tag] The tag.
 * @return The meta data or `null` if there is no such mapper registered for the given tag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-method-getMapperMetadata">Online Documentation</a>
 */
   fun <K : Any, V : Any>getMapperMetadata( tag: DpKeyBase<*, V> ):MapperMetadata<K, V>?
/**
 * Removes a previously registered mapper for the given tag.
 * @param [tag] The tag that has been used for registering the mapper.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-method-removeMapper">Online Documentation</a>
 */
   fun removeMapper( tag: DpKeyBase<*, *> )
/**
 * Sets the mapper meta data for the mapper that has been [registered][addMapper] using the provided `tag`.
 * @param [tag] The tag.
 * @param [metadata] The meta data to store with the mapper.
 * @throws ArgumentError If the [MapperMetadata.keyType] or [MapperMetadata.valueType] mismatch the mapper instance in the registry.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapperRegistry%23IMapperRegistry-method-setMapperMetadata">Online Documentation</a>
 */
   fun <K : Any, V : Any>setMapperMetadata( tag: DpKeyBase<*, V> ,
 metadata: MapperMetadata<K, V> )

companion object : InterfaceMetadata<IMapperRegistry> {
}
}

inline fun <V : Any> IMapperRegistry.createConstantMapper( 
    tag: GraphDpKey<V> ,
    constant: V?
):IMapper<IGraph, V> = 
    createConstantMapper(Graph.yclass.unsafeCast<YClass<IGraph>>(), tag.valueType, tag, constant)

inline fun <V : Any> IMapperRegistry.createDelegateMapper( 
    tag: GraphDpKey<V> ,
    noinline getter: MapperDelegate<IGraph, V>
):IMapper<IGraph, V> =
    createDelegateMapper(Graph.yclass.unsafeCast<YClass<IGraph>>(), tag.valueType, tag, getter)

inline fun <V : Any> IMapperRegistry.createMapper(tag: GraphDpKey<V>):Mapper<IGraph, V> =
    createMapper(Graph.yclass.unsafeCast<YClass<IGraph>>(), tag.valueType, tag)
