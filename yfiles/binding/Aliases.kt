// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.binding

/**
 * A callback that provides an unique identifier for the `dataItem`.
 * @param [TDataItem] The type of the data item
 * @param [dataItem] The value that will be passed in.
 * @param [canonicalId] The original canonical id of the value. For data arrays and iterables this is the index into the collection. For Maps and data objects this is the key associated with a value.
 */
typealias IdProvider<TDataItem> = (dataItem: TDataItem,
canonicalId: Any) -> Any

/**
 * A callback that provides an instance of type `TValue` for the given `dataItem`.
 * @param [TDataItem] The type of the data item a value shall be provided for.
 * @param [TValue] The type of the value to provide for the data item.
 * @param [dataItem] The data item for which a value shall be provided.
 */
typealias Provider<TDataItem, TValue> = (dataItem: TDataItem) -> TValue
