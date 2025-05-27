// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IMapper
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * The meta data that is associated with [IMapper]s in a [IMapperRegistry].
 * @see [IMapperRegistry.getMapperMetadata]
 * @see [IMapperRegistry.setMapperMetadata]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperMetadata">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [MapperMetadata] class.
 * @param [keyType] Type of the keys.
 * @param [valueType] Type of the values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperMetadata%23MapperMetadata-constructor-MapperMetadata(yfiles.lang.Class,yfiles.lang.Class)">Online Documentation</a>
 * 
 * @property keyType
 * The type of element the associated mapper accepts as keys for the mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperMetadata%23keyType">Online Documentation</a>
 * 
 * @property valueType
 * The type of element the associated mapper accepts as Values for the mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperMetadata%23valueType">Online Documentation</a>
 */
external open class MapperMetadata<TKey : Any, TValue : Any>  (
final val keyType: YClass<TKey>,
final val valueType: YClass<TValue>) : YObject {
/**
 * Initializes a new instance of the [MapperMetadata] from the given instance class.
 * @param [metadata] The metadata to copy key and value type from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperMetadata%23MapperMetadata-constructor-MapperMetadata(MapperMetadata)">Online Documentation</a>
 */
protected constructor( metadata: MapperMetadata<TKey, TValue> )

companion object : ClassMetadata<MapperMetadata<*, *>> {
/**
 * Creates an instance for the specified mapper.
 * @param [TKey] The type of the keys.
 * @param [TValue] The type of the values.
 * @param [keyType] The type of the keys.
 * @param [valueType] The type of the values.
 * @param [mapper] The mapper instance to create the metadata for.
 * @return An instance that uses the [keyType] and [valueType] of the mapper.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperMetadata%23MapperMetadata-method-create">Online Documentation</a>
 */
@JsName("create")
 final  operator fun <TKey : Any, TValue : Any>invoke( keyType: YClass<TKey> ,
 valueType: YClass<TValue> ,
 mapper: IMapper<TKey, TValue> ):MapperMetadata<TKey, TValue>
}
}
