// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.IDataMap
import yfiles.collections.IMapper
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * An adapter implementation that wraps an [IMapper] to an [IDataMap].
 * @param [K] The type of the key for the mapper.
 * @param [V] The type of the value for the mapper.
 * @see [DataProviderAdapter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataMapAdapter">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [DataMapAdapter] class.
 * @param [keyType] The type of the key for the mapper.
 * @param [valueType] The type of the value for the mapper.
 * @param [mapper] The mapper to adapt.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataMapAdapter%23DataMapAdapter-constructor-DataMapAdapter">Online Documentation</a>
 */
external open class DataMapAdapter<K : YObject, V : Any>  ( keyType: YClass<K> ,
 valueType: YClass<V> ,
 mapper: IMapper<K, V> ) : DataProviderAdapter<K, V>, IDataMap<K, V> {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataMapAdapter%23DataMapAdapter-method-set">Online Documentation</a>
 */
 final override  operator fun set( dataHolder: K ,
 value: V? )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataMapAdapter%23DataMapAdapter-method-setBoolean">Online Documentation</a>
 */
 final override   fun setBoolean( dataHolder: K ,
 value: Boolean )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataMapAdapter%23DataMapAdapter-method-setInt">Online Documentation</a>
 */
 final override   fun setInt( dataHolder: K ,
 value: Int )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataMapAdapter%23DataMapAdapter-method-setNumber">Online Documentation</a>
 */
 final override   fun setNumber( dataHolder: K ,
 value: Double )

companion object : ClassMetadata<DataMapAdapter<*, *>> {
}
}
