// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * An abstract adapter class for providing data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviderBase">Online Documentation</a>
 */
@JsName("DataProviderBase")
external abstract class DataProviderAdapter<in K : YObject, out V : Any>  : IDataProvider<K, V> {

/**
 * Subclasses may override this method to provide access to object values.
 * @throws NotSupportedError unless overwritten.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviderBase%23DataProviderAdapter-method-get">Online Documentation</a>
 */
 override  operator fun get( dataHolder: K ):V?
/**
 * Subclasses may override this method to provide access to boolean values.
 * @throws NotSupportedError unless overwritten.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviderBase%23DataProviderAdapter-method-getBoolean">Online Documentation</a>
 */
 override   fun getBoolean( dataHolder: K ):Boolean
/**
 * Subclasses may override this method to provide access to integer values.
 * @throws NotSupportedError unless overwritten.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviderBase%23DataProviderAdapter-method-getInt">Online Documentation</a>
 */
 override   fun getInt( dataHolder: K ):Int
/**
 * Subclasses may override this method to provide access to double values.
 * @throws NotSupportedError unless overwritten.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviderBase%23DataProviderAdapter-method-getNumber">Online Documentation</a>
 */
 override   fun getNumber( dataHolder: K ):Double

companion object : ClassMetadata<DataProviderAdapter<*, *>> {
}
}
