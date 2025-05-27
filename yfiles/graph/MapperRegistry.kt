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
import yfiles.collections.IEnumerable
import yfiles.collections.IMapper
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass

/**
 * A simple [Map][yfiles.collections.Map]-based implementation of the [IMapperRegistry] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperRegistry">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperRegistry%23MapperRegistry-constructor-MapperRegistry">Online Documentation</a>
 */
external  class MapperRegistry  () : IMapperRegistry {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperRegistry%23registeredTags">Online Documentation</a>
 */
final override val registeredTags: IEnumerable<Any>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperRegistry%23MapperRegistry-method-addMapper">Online Documentation</a>
 */
 final override   fun <K : Any, V : Any>addMapper( keyType: YClass<K> ,
 valueType: YClass<V> ,
 tag: DpKeyBase<*, V> ,
 mapper: IMapper<K, V> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperRegistry%23MapperRegistry-method-getMapper">Online Documentation</a>
 */
 final override   fun <K : Any, V : Any>getMapper( tag: DpKeyBase<*, V> ):IMapper<K, V>?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperRegistry%23MapperRegistry-method-getMapperMetadata">Online Documentation</a>
 */
 final override   fun <K : Any, V : Any>getMapperMetadata( tag: DpKeyBase<*, V> ):MapperMetadata<K, V>?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperRegistry%23MapperRegistry-method-removeMapper">Online Documentation</a>
 */
 final override   fun removeMapper( tag: DpKeyBase<*, *> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperRegistry%23MapperRegistry-method-setMapperMetadata">Online Documentation</a>
 */
 final override   fun <K : Any, V : Any>setMapperMetadata( tag: DpKeyBase<*, V> ,
 metadata: MapperMetadata<K, V> )

companion object : ClassMetadata<MapperRegistry> {
}
}
