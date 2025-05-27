// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.IDataProvider
import yfiles.collections.IMapper
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Wraps an [IMapper] into an [IDataProvider].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperDataProviderAdapter">Online Documentation</a>
 * 
 * @constructor Creates a new instance that adapts the provided mapper instance.
 * @param [keyType] The type of the keys.
 * @param [mapper] The mapper to adapt.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperDataProviderAdapter%23DataProviderAdapter-constructor-DataProviderAdapter">Online Documentation</a>
 */
@JsName("MapperDataProviderAdapter")
external open class DataProviderAdapter<in TKey : YObject, out TValue : Any>  ( keyType: YClass<TKey> ,
 mapper: IMapper<TKey, TValue> ) : IDataProvider<TKey, TValue> {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperDataProviderAdapter%23DataProviderAdapter-method-get">Online Documentation</a>
 */
 final override  operator fun get( dataHolder: TKey ):TValue?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperDataProviderAdapter%23DataProviderAdapter-method-getBoolean">Online Documentation</a>
 */
 final override   fun getBoolean( dataHolder: TKey ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperDataProviderAdapter%23DataProviderAdapter-method-getInt">Online Documentation</a>
 */
 final override   fun getInt( dataHolder: TKey ):Int
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperDataProviderAdapter%23DataProviderAdapter-method-getNumber">Online Documentation</a>
 */
 final override   fun getNumber( dataHolder: TKey ):Double

companion object : ClassMetadata<DataProviderAdapter<*, *>> {
}
}
