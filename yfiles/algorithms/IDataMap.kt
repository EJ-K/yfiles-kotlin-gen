// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface that combines the [IDataProvider] and [IDataAcceptor] interfaces.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataMap">Online Documentation</a>
 */
external interface IDataMap<in K : YObject, V : Any> : IDataProvider<K, V>, IDataAcceptor<K, V> {

companion object : InterfaceMetadata<IDataMap<*, *>> {
}
}
